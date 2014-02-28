/**
 * Copyright 2012 ArcBees Inc.
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

package com.shpitc.driveshare.client.application.home;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.shpitc.driveshare.client.application.AppData;
import com.shpitc.driveshare.client.application.ApplicationPresenter;
import com.shpitc.driveshare.client.event.AppInitializedEvent;
import com.shpitc.driveshare.client.event.AppInitializedEvent.AppInitializedHandler;
import com.shpitc.driveshare.client.place.NameTokens;
import com.shpitc.driveshare.shared.actions.infra.GetAppInitDataAction;
import com.shpitc.driveshare.shared.actions.infra.GetAppInitDataResult;
import com.shpitc.driveshare.shared.messages.MessageSource;

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> implements AppInitializedHandler {
    @Override
	protected void onReset() {
    	super.onReset();
//		getView().setTextToServer("aaa");
//		getView().setServerResponse("Waiting for response...");
//		dispatcher.execute(new SendTextToServer("zaebis"),
//				new AsyncCallback<SendTextToServerResult>() {
//					@Override
//					public void onFailure(Throwable caught) {
//						Window.alert(caught.toString());
////						getView().setServerResponse(
////								"An error occured: " + caught.getMessage());
//					}
//	
//					@Override
//					public void onSuccess(SendTextToServerResult result) {
////						getView().setServerResponse(result.getResponse());
//						Window.alert(result.getResponse());
//					}
//				});
    	
    	dispatcher.execute(new GetAppInitDataAction(),
				new AsyncCallback<GetAppInitDataResult>() {
					@Override
					public void onFailure(Throwable caught) {
					Window.alert(caught.toString());
					
					}
	
					@Override
					public void onSuccess(GetAppInitDataResult result) {
						
						MessageSource messageSource = result.getAppInitDataDto().getMessageSource();
						
						getView().setLabel(messageSource.getMessage("hello.world"));
						
						Window.alert(messageSource.getMessage("hello.world"));
					}
				});
    	
    	
//    	MessagesService.Util.getInstance().getMessageSource("en", new AsyncCallback<MessageSource>() {
//			
//			@Override
//			public void onSuccess(MessageSource result) {
//				Window.alert(result.getMessage("hello.world"));
//				
//			}
//			
//			@Override
//			public void onFailure(Throwable caught) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
	}



	public interface MyView extends View {


		void setLabel(String label);
    }

    @ProxyStandard
    @NameToken(NameTokens.home)
    public interface MyProxy extends ProxyPlace<HomePagePresenter> {
    }
    
    
    private final DispatchAsync dispatcher;
    private final EventBus eventBus;
    private final AppData appData;
    
    
    

    @Inject
    public HomePagePresenter(EventBus eventBus, MyView view, MyProxy proxy, DispatchAsync dispatcher,AppData appData) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
        
        this.dispatcher = dispatcher;
        this.appData = appData;        
        this.eventBus = eventBus;

        this.eventBus.addHandler(AppInitializedEvent.getType(), this);
    }



	@Override
	public void onAppInitialized(AppInitializedEvent event) {
		
		Window.alert(appData.getMessageSource().getMessage("hello.world"));		
	}
}
