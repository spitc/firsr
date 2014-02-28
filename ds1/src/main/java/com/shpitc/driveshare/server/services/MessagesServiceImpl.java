package com.shpitc.driveshare.server.services;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

//import org.gwtwidgets.server.spring.ServletUtils;




import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.shpitc.driveshare.server.messages.MessageSourceLoader;
import com.shpitc.driveshare.shared.messages.MessageSource;
import com.shpitc.driveshare.shared.messages.MessagesService;


public class MessagesServiceImpl extends RemoteServiceServlet implements MessagesService {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1132768061165218309L;
	
	private Map<String, MessageSource> messageSourceMap = new ConcurrentHashMap<String, MessageSource>();
	private MessageSourceLoader loader;
	private Set<String> missingKeys = new HashSet<String>();
	
	public void setMessageSourceLoader(MessageSourceLoader loader) {
		this.loader = loader;
	}

	@Override
	public MessageSource getMessageSource(String language) {
		if (language == null)
			language = Locale.getDefault().getLanguage();
		
		MessageSource messageSource = messageSourceMap.get(language);
		if (messageSource == null) {
			messageSource = loader.loadMessageSource(language);
			if (messageSource != null)
				messageSourceMap.put(language, messageSource);
		}
		return messageSource;
	}

	@Override
	public String getDefaultLanguage() {
//		return ServletUtils.getRequest().getLocale().getLanguage();
		return "en";
	}

	@Override
	public void keyNotFound(String key) {
		missingKeys.add(key);
	}
	
	public void dumpMissing() throws Exception {
		Writer w = new OutputStreamWriter(new FileOutputStream("/tmp/messages_bo.properties"));
		
		for (String key  : missingKeys) {
			w.write(key+"=\n");
		}
		w.close();
	}

}
