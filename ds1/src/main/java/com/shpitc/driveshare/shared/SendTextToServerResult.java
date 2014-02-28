package com.shpitc.driveshare.shared;

import com.gwtplatform.dispatch.shared.Result;

public class SendTextToServerResult implements Result {

	
	private static final long serialVersionUID = -5599018077948414093L;
	private String response;

	@SuppressWarnings("unused")
	private SendTextToServerResult() {
		// For serialization only
	}

	public SendTextToServerResult(String response) {
		this.response = response;
	}

	public String getResponse() {
		return response;
	}
}
