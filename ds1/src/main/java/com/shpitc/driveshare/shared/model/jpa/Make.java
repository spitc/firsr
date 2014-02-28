package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the make database table.
 * 
 */
@Entity
@NamedQuery(name="Make.findAll", query="SELECT m FROM Make m")
public class Make implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String code;

	private String title;

	public Make() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}