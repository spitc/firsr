package com.shpitc.driveshare.server.dao;

import com.shpitc.driveshare.shared.model.jpa.Account;



public interface AccountDao {
	
	
	Account get(int id);

	Account put(Account account);

}
