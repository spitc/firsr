package com.shpitc.driveshare.server.handlers;

import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.AbstractActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;
import com.shpitc.driveshare.server.dao.AccountDao;
import com.shpitc.driveshare.shared.actions.GeneratedAction;
import com.shpitc.driveshare.shared.actions.GeneratedResult;
import com.shpitc.driveshare.shared.messages.MessagesService;
import com.shpitc.driveshare.shared.model.jpa.Account;

public class GeneratedActionHandler extends AbstractActionHandler<GeneratedAction, GeneratedResult> {

//	@Autowired	  
//	private ServletContext servletContext;
	
//	@Autowired
//	private Mapper dozerBeanMapper;
//	  
	private AccountDao accountDao;
	private MessagesService messageService;
	
	  
	

	public void setMessageSourceService(MessagesService messageService) {
		this.messageService = messageService;
	}

	public GeneratedActionHandler() {
		super(GeneratedAction.class);
		
	}
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public GeneratedResult execute(GeneratedAction arg0, ExecutionContext arg1)
			throws ActionException {
		
		Account account = accountDao.get(1);
		
		String msg = messageService.getMessageSource("iw").getMessage("hello.world");
		System.out.println(msg);
		
		return new GeneratedResult(account.getEmail());
	}

	@Override
	public void undo(GeneratedAction arg0, GeneratedResult arg1,
			ExecutionContext arg2) throws ActionException {
		
		
	}

}
