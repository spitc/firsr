package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the obd_data database table.
 * 
 */
@Entity
@Table(name="obd_data")
@NamedQuery(name="ObdData.findAll", query="SELECT o FROM ObdData o")
public class ObdData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="vehicle_id")
	private int vehicleId;

	public ObdData() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

}