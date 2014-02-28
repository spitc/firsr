package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vehicle_garage database table.
 * 
 */
@Embeddable
public class VehicleGaragePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="vehicle_id", insertable=false, updatable=false)
	private int vehicleId;

	@Column(name="garage_id", insertable=false, updatable=false)
	private int garageId;

	public VehicleGaragePK() {
	}
	public int getVehicleId() {
		return this.vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getGarageId() {
		return this.garageId;
	}
	public void setGarageId(int garageId) {
		this.garageId = garageId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VehicleGaragePK)) {
			return false;
		}
		VehicleGaragePK castOther = (VehicleGaragePK)other;
		return 
			(this.vehicleId == castOther.vehicleId)
			&& (this.garageId == castOther.garageId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.vehicleId;
		hash = hash * prime + this.garageId;
		
		return hash;
	}
}