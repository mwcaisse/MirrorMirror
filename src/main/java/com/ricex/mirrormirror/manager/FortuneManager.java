package com.ricex.mirrormirror.manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FortuneManager {

	public String getFortune() {
		StringBuilder builder = new StringBuilder();
		
		try {
			Process p = Runtime.getRuntime().exec("fortune -a");
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			String line = "";
			while ( (line = reader.readLine()) != null) {
				builder.append(line);
				builder.append("\n");
			}
		}
		catch (IOException | InterruptedException e) {
			builder = new StringBuilder();
			builder.append("Failed to read fortune: ");
			builder.append(e.getMessage());
		}		
		
		return builder.toString();
	}
	
}
