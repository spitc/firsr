package com.shpitc.driveshare.server.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.shpitc.driveshare.server.dao.AccountDao;
import com.shpitc.driveshare.shared.model.jpa.Account;


public class AccountDaoImpl implements AccountDao{


	@PersistenceContext(unitName = "driveshare")
	private EntityManager em;


	@Override
	public Account get(int id) {
		return em.find(Account.class, id);
	}
	
	@Override
	public Account put(Account account) {
		return em.merge(account);
	}

}
