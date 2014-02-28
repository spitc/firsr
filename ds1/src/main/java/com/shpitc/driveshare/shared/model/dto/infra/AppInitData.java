package com.shpitc.driveshare.shared.model.dto.infra;

import org.springframework.core.annotation.Order;

import com.gwtplatform.dispatch.annotation.GenDto;
import com.shpitc.driveshare.shared.messages.MessageSource;

@GenDto
public class AppInitData {
	@Order(1) private MessageSource messageSource;

}
