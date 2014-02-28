package com.shpitc.driveshare.shared.messages;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class MapMessageSource implements MessageSource, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6751393210405048868L;
	
	private Map<String, String> map;
	private boolean sendKeyWhenNotFound = true;
	
	public MapMessageSource() {
	}
	
	public MapMessageSource(Map<String, String> source) {
		map = new HashMap<String, String>(source);
	}
	
	public MapMessageSource(Map<String, String> source, boolean sendKeyWhenNotFound) {
		map = new HashMap<String, String>(source);
		this.sendKeyWhenNotFound = sendKeyWhenNotFound;
	}

	public Map<String, String> getMap() {
		return map;
	}
	
	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public boolean isSendKeyWhenNotFound() {
		return sendKeyWhenNotFound;
	}

	public void setSendKeyWhenNotFound(boolean sendKeyWhenNotFound) {
		this.sendKeyWhenNotFound = sendKeyWhenNotFound;
	}

	@Override
	public String getMessage(String key) {
		String message = map.get(key);		

		try {
		if (message != null) {
			String[] technicalMessages = null;
			int indexOf = message.indexOf("{T");
			if (indexOf != -1) {
				technicalMessages = map.get(key+".tech").split("{;}");
				while (indexOf != -1) {
					try {
						String paramIndex = message.substring(indexOf+2, indexOf+3);
						message = message.replace("{T"+paramIndex+"}", technicalMessages[Integer.parseInt(paramIndex)]);
					} catch (Exception e) {	}
					indexOf = message.indexOf("{T", indexOf+1);
				}
			}
		}
		} catch(Exception e) {}
		
		return message;
	}

	@Override
	public String getMessage(String key, String defaultText) {
		String val = getMessage(key);
		return val == null ? defaultText : val;
	}

	@Override
	public String getMessage(String key, String defaultText, String[] a) {
		String val = getMessage(key);
		if(val == null)
			val = defaultText;
		return insertParamsToString(val, a);
	}
	
	private String insertParamsToString(String str, String[] params) {
		for(int i = 0; i < params.length; i++) {
			str = str.replace("{"+i+"}", params[i]);
		}
		return str;
	}

}
