package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vehicle_owner database table.
 * 
 */
@Entity
@Table(name="vehicle_owner")
@NamedQuery(name="VehicleOwner.findAll", query="SELECT v FROM VehicleOwner v")
public class VehicleOwner implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VehicleOwnerPK id;

	public VehicleOwner() {
	}

	public VehicleOwnerPK getId() {
		return this.id;
	}

	public void setId(VehicleOwnerPK id) {
		this.id = id;
	}

}