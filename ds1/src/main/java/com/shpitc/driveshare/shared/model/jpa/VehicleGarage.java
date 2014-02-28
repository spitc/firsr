package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vehicle_garage database table.
 * 
 */
@Entity
@Table(name="vehicle_garage")
@NamedQuery(name="VehicleGarage.findAll", query="SELECT v FROM VehicleGarage v")
public class VehicleGarage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VehicleGaragePK id;

	public VehicleGarage() {
	}

	public VehicleGaragePK getId() {
		return this.id;
	}

	public void setId(VehicleGaragePK id) {
		this.id = id;
	}

}