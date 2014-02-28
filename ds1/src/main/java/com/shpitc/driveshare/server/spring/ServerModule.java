package com.shpitc.driveshare.server.spring;

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


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.shpitc.driveshare.server.handlers.GeneratedActionHandler;
import com.shpitc.driveshare.server.handlers.SendTextToServerHandler;
import com.shpitc.driveshare.server.handlers.infra.GetAppInitDataActionHandler;
import com.gwtplatform.dispatch.server.spring.HandlerModule;
import com.gwtplatform.dispatch.server.spring.configuration.DefaultModule;
import com.shpitc.driveshare.shared.SendTextToServer;
import com.shpitc.driveshare.shared.actions.GeneratedAction;
import com.shpitc.driveshare.shared.actions.infra.GetAppInitDataAction;

/**
 * Module which binds the handlers and configurations.

 * @author Philippe Beaudoin
 */
@Configuration
@Import(DefaultModule.class)
public class ServerModule extends HandlerModule {

  public ServerModule() {
  }

//  @Bean
//  public SendTextToServerHandler getSendTextToServerHandler() {
//    return new SendTextToServerHandler();
//  }
//
//  @Bean
//  public ActionValidator getDefaultActionValidator() {
//    return new DefaultActionValidator();
//  }

  protected void configureHandlers() {
    bindHandler(SendTextToServer.class, SendTextToServerHandler.class);
    bindHandler(GeneratedAction.class, GeneratedActionHandler.class);
    bindHandler(GetAppInitDataAction.class, GetAppInitDataActionHandler.class);    
  }
}