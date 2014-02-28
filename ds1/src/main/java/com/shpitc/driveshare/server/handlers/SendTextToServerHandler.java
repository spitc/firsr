package com.shpitc.driveshare.server.handlers;

/**
 * Copyright 2010 ArcBees Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */


//import com.google.inject.Inject;
//import com.google.inject.Provider;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.AbstractActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;
import com.shpitc.driveshare.server.dao.AccountDao;
import com.shpitc.driveshare.shared.FieldVerifier;
import com.shpitc.driveshare.shared.SendTextToServer;
import com.shpitc.driveshare.shared.SendTextToServerResult;
import com.shpitc.driveshare.shared.model.jpa.Account;

/**
 * @author Philippe Beaudoin
 */
public class SendTextToServerHandler extends
  AbstractActionHandler<SendTextToServer, SendTextToServerResult> {

  @Autowired
  private ServletContext servletContext;
  
//  @Autowired
//  private Mapper dozerBeanMapper;
  
  private AccountDao accountDao;

  public void setAccountDao(AccountDao accountDao) {
	this.accountDao = accountDao;
}

public SendTextToServerHandler() {
    super(SendTextToServer.class);
  }

  @Override
  public SendTextToServerResult execute(SendTextToServer action,
      ExecutionContext context) throws ActionException {

    String input = action.getTextToServer();

    // Verify that the input is valid.
    if (!FieldVerifier.isValidName(input)) {
      // If the input is not valid, throw an IllegalArgumentException back to
      // the client.
      throw new ActionException("Name must be at least 4 characters long");
    }
    
    
//    Account account = new Account();
//    account.setId(23);
//    account.setEmail("asd@asd.com");
//    account.setUsername("sdgsdv");
//    account.setPassword("kkfghtgb");
    
    Account account = accountDao.get(1);
    
//    AccountDto accountDto1 = new AccountDto(23,"asd@asd.com","sdgsdv","kkfghtgb");
    
    
    
    
    
    
//    try {
//    	
//    	Object o = account;    	
//    	String dtoName = o.getClass().getSimpleName()+"Dto";   
//    	Class clazz = Class.forName("com.as.pricewatch.shared.model.dto."+dtoName);
//		AccountDto accountDto = dozerBeanMapper.map(account, clazz);		
//	    System.out.println(accountDto.getId()+" "+accountDto.getUsername()+" "+accountDto.getEmail()+" "+accountDto.getPassword());
//
//	    
//	    Object o1 = accountDto1;	    
//	    String nameS = o1.getClass().getSimpleName();
//	    String reverse = new StringBuffer(nameS).reverse().toString();
//	    String cutReverse = reverse.substring(3);
//	    String nameF = new StringBuffer(cutReverse).reverse().toString();	    
//	    Class clazz1 = Class.forName("com.as.pricewatch.shared.model.jpa."+nameF);
//	    Account account2 = dozerBeanMapper.map(accountDto1, clazz1);
//	    System.out.println(account2.getId()+" "+account2.getUsername()+" "+account2.getEmail()+" "+account2.getPassword());
//
//	    
//	} catch (ClassNotFoundException e) {
//		e.printStackTrace();
//	}
    
//    AccountDto accountDto = dozerBeanMapper.map(account, AccountDto.class);
    
    
    
    
//    Account account1 = dozerBeanMapper.map(accountDto1, Account.class);
//    System.out.println(account1.getId()+" "+account1.getUsername()+" "+account1.getEmail()+" "+account1.getPassword());

    String serverInfo = servletContext.getServerInfo();
    return new SendTextToServerResult("Hello, " + account.getEmail() + " !!!!!! " + serverInfo);
  }

  @Override
  public Class<SendTextToServer> getActionType() {
    return SendTextToServer.class;
  }

  @Override
  public void undo(SendTextToServer action, SendTextToServerResult result,
      ExecutionContext context) throws ActionException {
    // Not undoable
  }

}