package com.shpitc.driveshare.shared.model.dto;

import org.springframework.core.annotation.Order;

import com.gwtplatform.dispatch.annotation.GenDto;



@GenDto
public class Account {
	@Order(1) private int id;
	@Order(2) private String email;
	@Order(3) private String password;
	@Order(4) private String username;
}
