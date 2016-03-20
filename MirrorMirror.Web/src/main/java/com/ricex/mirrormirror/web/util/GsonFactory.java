package com.ricex.mirrormirror.web.util;

import java.text.DateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ricex.mirrormirror.common.util.JsonDateMillisecondsEpochDeserializer;

public class GsonFactory {
	
	
	
	public GsonFactory() {
		
	}
	
	/** Factory method to construct the Gson parser
	 * 
	 * @return The Gson parser
	 */
	public Gson constructGson() {
		Gson gson = new GsonBuilder().serializeNulls().setDateFormat(DateFormat.LONG)
				.registerTypeAdapter(Date.class, new JsonDateMillisecondsEpochDeserializer())
				.create();		
		return gson;
	}
}
