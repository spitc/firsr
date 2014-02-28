package com.shpitc.driveshare.shared.messages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("services/messages")
public interface MessagesService extends RemoteService {

	public static class Util {

		public static MessagesServiceAsync getInstance() {

			return GWT.create(MessagesService.class);
		}
	}
	
	/**
	 * Retrieves the message source of the given language.
	 * The message source is built from the default language keys, overwritten by the selected language keys, overwritten by the user's brand keys.
	 * @param language - the language of the message source.
	 * @return MessageSource object.
	 */
	MessageSource getMessageSource(String language);
	
	/**
	 * Retrieves the default language of the user made the request for the page.
	 * @return language iso (ex. Spanish - ES).
	 */
	String getDefaultLanguage();
	
	/**
	 * Allow client to report a not found key. The server may use this method to write a template for missing messages.
	 * @param key
	 */
	void keyNotFound(String key);
}
