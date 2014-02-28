package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the garage database table.
 * 
 */
@Entity
@NamedQuery(name="Garage.findAll", query="SELECT g FROM Garage g")
public class Garage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to GarageUser
	@OneToMany(mappedBy="garage")
	private List<GarageUser> garageUsers;

	public Garage() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<GarageUser> getGarageUsers() {
		return this.garageUsers;
	}

	public void setGarageUsers(List<GarageUser> garageUsers) {
		this.garageUsers = garageUsers;
	}

	public GarageUser addGarageUser(GarageUser garageUser) {
		getGarageUsers().add(garageUser);
		garageUser.setGarage(this);

		return garageUser;
	}

	public GarageUser removeGarageUser(GarageUser garageUser) {
		getGarageUsers().remove(garageUser);
		garageUser.setGarage(null);

		return garageUser;
	}

}