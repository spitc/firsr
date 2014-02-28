package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the model database table.
 * 
 */
@Entity
@NamedQuery(name="Model.findAll", query="SELECT m FROM Model m")
public class Model implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String code;

	@Column(name="make_id")
	private int makeId;

	private String title;

	public Model() {
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

	public int getMakeId() {
		return this.makeId;
	}

	public void setMakeId(int makeId) {
		this.makeId = makeId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}