package com.ricex.mirrormirror.weather;

public class WeatherLocation {

	public double latitude;
	
	public double longitude;
	
	public WeatherLocation(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof WeatherLocation) {
			WeatherLocation ow = (WeatherLocation) other;
			
			return ow.latitude == this.latitude &&
				   ow.longitude == this.longitude;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (Double.valueOf(latitude).hashCode() * 5) ^ (Double.valueOf(longitude).hashCode()  * 3);
	}
	
}
