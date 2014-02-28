package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="owner_id")
	private int ownerId;

	public Company() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

}