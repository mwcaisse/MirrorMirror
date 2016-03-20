package com.ricex.mirrormirror.viewmodel.weather;

import java.util.List;

public class Weather {

	private WeatherCurrently currently;
	
	private List<WeatherDay> future;

	/**
	 * @return the currently
	 */
	public WeatherCurrently getCurrently() {
		return currently;
	}

	/**
	 * @param currently the currently to set
	 */
	public void setCurrently(WeatherCurrently currently) {
		this.currently = currently;
	}

	/**
	 * @return the future
	 */
	public List<WeatherDay> getFuture() {
		return future;
	}

	/**
	 * @param future the future to set
	 */
	public void setFuture(List<WeatherDay> future) {
		this.future = future;
	}	
	
}
