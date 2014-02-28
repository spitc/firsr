package com.shpitc.driveshare.server.handlers.infra;

import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.AbstractActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;
import com.shpitc.driveshare.shared.actions.infra.GetAppInitDataAction;
import com.shpitc.driveshare.shared.actions.infra.GetAppInitDataResult;
import com.shpitc.driveshare.shared.messages.MessageSource;
import com.shpitc.driveshare.shared.messages.MessagesService;
import com.shpitc.driveshare.shared.model.dto.infra.AppInitDataDto;

public class GetAppInitDataActionHandler extends AbstractActionHandler<GetAppInitDataAction, GetAppInitDataResult> {


	private MessagesService messageService;

	public GetAppInitDataActionHandler() {
		super(GetAppInitDataAction.class);
		
	}
	
	public void setMessageSourceService(MessagesService messageService) {
		this.messageService = messageService;
	}

	@Override
	public GetAppInitDataResult execute(GetAppInitDataAction action,
			ExecutionContext context) throws ActionException {
		
		
		MessageSource messageSource = messageService.getMessageSource("iw");

		GetAppInitDataResult result = new GetAppInitDataResult(new AppInitDataDto(messageSource));
		
		return result;
	}

	@Override
	public void undo(GetAppInitDataAction action, GetAppInitDataResult result,
			ExecutionContext context) throws ActionException {
		
	}



}
