package com.shpitc.driveshare.server.messages;

import java.util.Locale;
import java.util.Map;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import com.shpitc.driveshare.shared.messages.MapMessageSource;
import com.shpitc.driveshare.shared.messages.MessageSource;



public class MessageSourceLoader extends ReloadableResourceBundleMessageSource {
	
	private boolean sendKeyWhenNotFound = true;
	
	public void setSendKeyWhenNotFound(boolean sendKeyWhenNotFound) {
		this.sendKeyWhenNotFound = sendKeyWhenNotFound;
	}

	public MessageSource loadMessageSource(String language) {
		Locale locale = language == null ? Locale.getDefault() : new Locale(language);
		PropertiesHolder mergedProperties = getMergedProperties(locale);
		
		@SuppressWarnings("rawtypes")
		Map messageMap = mergedProperties.getProperties();
		
		@SuppressWarnings("unchecked")
		MessageSource messageSource = new MapMessageSource(messageMap, sendKeyWhenNotFound);
		
		return messageSource;
	}
}
