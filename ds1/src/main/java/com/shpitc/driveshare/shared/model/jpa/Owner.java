package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the owner database table.
 * 
 */
@Entity
@NamedQuery(name="Owner.findAll", query="SELECT o FROM Owner o")
public class Owner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to AppUser
	@OneToMany(mappedBy="owner")
	private List<Account> appUsers;

	public Owner() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Account> getAppUsers() {
		return this.appUsers;
	}

	public void setAppUsers(List<Account> appUsers) {
		this.appUsers = appUsers;
	}

	public Account addAppUser(Account appUser) {
		getAppUsers().add(appUser);
		appUser.setOwner(this);

		return appUser;
	}

	public Account removeAppUser(Account appUser) {
		getAppUsers().remove(appUser);
		appUser.setOwner(null);

		return appUser;
	}

}