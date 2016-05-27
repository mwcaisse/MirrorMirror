"use strict";

define("Modules/Weather/WeatherModel", ["Service/util", "Service/applicationProxy"],
		
	function (util, proxy) {
	
	var vm = function(data) {
		var self = this;

		self.tempCurrent = data.tempCurrent;
		self.day = new Date(data.day);
		self.summary = data.summary;
		self.summaryDetailed = data.summaryDetailed;
		self.icon = data.icon;
		self.tempHigh = data.tempHigh;
		self.tempLow = data.tempLow;
		self.windSpeed = data.windSpeed;
		self.precipChance = data.precipChance;
		self.precipType = data.precipType;			
	};
	
	return vm;
	
});