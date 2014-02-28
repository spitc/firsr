package com.shpitc.driveshare.client.application;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.shpitc.driveshare.client.event.AppInitializedEvent;
import com.shpitc.driveshare.shared.actions.infra.GetAppInitDataAction;
import com.shpitc.driveshare.shared.actions.infra.GetAppInitDataResult;
import com.shpitc.driveshare.shared.messages.MessageSource;

public class AppData {
	
	private final EventBus eventBus;
	
	
	private MessageSource messageSource;
	private final DispatchAsync dispatcher;
	
	 public MessageSource getMessageSource() {
		return messageSource;
	}

	
	
	@Inject
	public AppData(DispatchAsync dispatcher, EventBus eventBus) {
		
		 this.dispatcher = dispatcher;
		 this.eventBus = eventBus;
		
		init();
	}



	private void init() {
    	dispatcher.execute(new GetAppInitDataAction(),
				new AsyncCallback<GetAppInitDataResult>() {
					@Override
					public void onFailure(Throwable caught) {
					Window.alert(caught.toString());
					
					}
	
					@Override
					public void onSuccess(GetAppInitDataResult result) {
						
						messageSource = result.getAppInitDataDto().getMessageSource();
						
						AppInitializedEvent initEvent = new AppInitializedEvent();
						eventBus.fireEvent(initEvent);
						
//						Window.alert(messageSource.getMessage("hello.world"));
					}
				});
		
	}


}
