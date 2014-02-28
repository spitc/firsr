package com.shpitc.driveshare.shared.messages;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MessagesServiceAsync {

	/**
	 * Retrieves the message source of the given language.
	 * The message source is built from the default language keys, overwritten by the selected language keys, overwritten by the user's brand keys.
	 * @param language - the language of the message source.
	 * @return MessageSource object.
	 */
	void getMessageSource(String language, AsyncCallback<MessageSource> callback);
	
	/**
	 * Retrieves the default language of the user made the request for the page.
	 * @return language iso (ex. Spanish - ES).
	 */
	void getDefaultLanguage(AsyncCallback<String> callback);
	
	void keyNotFound(String key, AsyncCallback<Void> callback);
}
