package com.ricex.mirrormirror.weather;

import java.time.Duration;
import java.time.Instant;

import com.ricex.mirrormirror.weather.model.ForecastWeather;

public class ForecastCacheEntry {

	private WeatherLocation location;
	
	private ForecastWeather weather;
	
	private Instant cacheInstant;
	
	private Duration validFor;
	
	/** Creates a new cache entry for the given weather object with the default duration of 30 minutes
	 * 
	 * @param weather The weather entry to cache
	 */
	public ForecastCacheEntry(WeatherLocation location, ForecastWeather weather) {
		this(location, weather, Duration.ofMinutes(30));
	}
	
	/** Creates a new cache entry for the given weather object with the given duration
	 * 
	 * @param weather The weather entry to cache
	 * @param validFor The duration that the entry is valid for
	 */
	public ForecastCacheEntry(WeatherLocation location, ForecastWeather weather, Duration validFor) {
		this.location = location;
		this.weather = weather;
		this.validFor = validFor;
		this.cacheInstant = Instant.now();
	}	
	
	/**
	 * @return the location
	 */
	public WeatherLocation getLocation() {
		return location;
	}

	/**
	 * @return the weather
	 */
	public ForecastWeather getWeather() {
		return weather;
	}

	/**
	 * @return the cacheInstant
	 */
	public Instant getCacheInstant() {
		return cacheInstant;
	}
	
	/** Returns whether this cache entry has expired or not
	 * 
	 * @return True if the entry has expired, false otherwise
	 */
	public boolean hasExpired() {
		Duration cacheDuration = Duration.between(cacheInstant, Instant.now());
		// if it retuns a negative # or zero, then the time the entry has been in the cache, is longer
		// than the specified valid duration, and has expired		
		int comp = validFor.compareTo(cacheDuration);
		return comp <= 0; 

	}


	
}
