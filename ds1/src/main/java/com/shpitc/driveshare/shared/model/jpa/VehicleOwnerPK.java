package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the vehicle_owner database table.
 * 
 */
@Embeddable
public class VehicleOwnerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="vehicle_id", insertable=false, updatable=false)
	private int vehicleId;

	@Column(name="owner_id", insertable=false, updatable=false)
	private int ownerId;

	public VehicleOwnerPK() {
	}
	public int getVehicleId() {
		return this.vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VehicleOwnerPK)) {
			return false;
		}
		VehicleOwnerPK castOther = (VehicleOwnerPK)other;
		return 
			(this.vehicleId == castOther.vehicleId)
			&& (this.ownerId == castOther.ownerId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.vehicleId;
		hash = hash * prime + this.ownerId;
		
		return hash;
	}
}