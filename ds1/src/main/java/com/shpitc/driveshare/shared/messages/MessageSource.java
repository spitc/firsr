package com.shpitc.driveshare.shared.messages;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

public interface MessageSource extends Serializable, IsSerializable {
	String getMessage(String key);
	String getMessage(String key, String defaultText);
	String getMessage(String key, String defaultText, String[] a);
}
