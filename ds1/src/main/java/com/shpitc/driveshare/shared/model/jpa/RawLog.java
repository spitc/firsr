package com.shpitc.driveshare.shared.model.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the raw_logs database table.
 * 
 */
@Entity
@Table(name="raw_logs")
@NamedQuery(name="RawLog.findAll", query="SELECT r FROM RawLog r")
public class RawLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RawLogPK id;

	private float k11;

	private float k2f;

	private float k4;

	private float k46;

	private float k5;

	private float kc;

	private float kd;

	private float kf;

	private float kff1001;

	private float kff1005;

	private float kff1006;

	private float kff1007;

	private float kff1220;

	private float kff1221;

	private float kff1226;

	private String time;

	private String v;

	public RawLog() {
	}

	public RawLogPK getId() {
		return this.id;
	}

	public void setId(RawLogPK id) {
		this.id = id;
	}

	public float getK11() {
		return this.k11;
	}

	public void setK11(float k11) {
		this.k11 = k11;
	}

	public float getK2f() {
		return this.k2f;
	}

	public void setK2f(float k2f) {
		this.k2f = k2f;
	}

	public float getK4() {
		return this.k4;
	}

	public void setK4(float k4) {
		this.k4 = k4;
	}

	public float getK46() {
		return this.k46;
	}

	public void setK46(float k46) {
		this.k46 = k46;
	}

	public float getK5() {
		return this.k5;
	}

	public void setK5(float k5) {
		this.k5 = k5;
	}

	public float getKc() {
		return this.kc;
	}

	public void setKc(float kc) {
		this.kc = kc;
	}

	public float getKd() {
		return this.kd;
	}

	public void setKd(float kd) {
		this.kd = kd;
	}

	public float getKf() {
		return this.kf;
	}

	public void setKf(float kf) {
		this.kf = kf;
	}

	public float getKff1001() {
		return this.kff1001;
	}

	public void setKff1001(float kff1001) {
		this.kff1001 = kff1001;
	}

	public float getKff1005() {
		return this.kff1005;
	}

	public void setKff1005(float kff1005) {
		this.kff1005 = kff1005;
	}

	public float getKff1006() {
		return this.kff1006;
	}

	public void setKff1006(float kff1006) {
		this.kff1006 = kff1006;
	}

	public float getKff1007() {
		return this.kff1007;
	}

	public void setKff1007(float kff1007) {
		this.kff1007 = kff1007;
	}

	public float getKff1220() {
		return this.kff1220;
	}

	public void setKff1220(float kff1220) {
		this.kff1220 = kff1220;
	}

	public float getKff1221() {
		return this.kff1221;
	}

	public void setKff1221(float kff1221) {
		this.kff1221 = kff1221;
	}

	public float getKff1226() {
		return this.kff1226;
	}

	public void setKff1226(float kff1226) {
		this.kff1226 = kff1226;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getV() {
		return this.v;
	}

	public void setV(String v) {
		this.v = v;
	}

}