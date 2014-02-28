package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the raw_logs database table.
 * 
 */
@Embeddable
public class RawLogPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String session;

	private String id;

	public RawLogPK() {
	}
	public String getSession() {
		return this.session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RawLogPK)) {
			return false;
		}
		RawLogPK castOther = (RawLogPK)other;
		return 
			this.session.equals(castOther.session)
			&& this.id.equals(castOther.id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.session.hashCode();
		hash = hash * prime + this.id.hashCode();
		
		return hash;
	}
}