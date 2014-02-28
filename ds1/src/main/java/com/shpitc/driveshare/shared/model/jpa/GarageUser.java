package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the garage_user database table.
 * 
 */
@Entity
@Table(name="garage_user")
@NamedQuery(name="GarageUser.findAll", query="SELECT g FROM GarageUser g")
public class GarageUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String email;

	private String password;

	private String username;

	//bi-directional many-to-one association to Garage
	@ManyToOne
	private Garage garage;

	public GarageUser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Garage getGarage() {
		return this.garage;
	}

	public void setGarage(Garage garage) {
		this.garage = garage;
	}

}