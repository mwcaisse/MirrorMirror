"use strict";

define("Modules/Weather/WeatherModel", 
		["moment", 
		 "Service/util", 
		 "Service/applicationProxy", 
		 "moment-duration-format"],
		
	function (moment, util, proxy) {
	
	var vm = function(data) {
		var self = this;

		self.tempCurrent = ko.observable(0);
		self.day = ko.observable(moment());
		self.summary = ko.observable("");
		self.summaryDetailed = ko.observable("");
		self.icon = ko.observable("");
		self.tempHigh = ko.observable(0);
		self.tempLow = ko.observable(0);
		self.windSpeed = ko.observable(0);
		self.precipChance = ko.observable(0);
		self.precipType = ko.observable("");	
		
		self.iconCss = ko.computed(function () {
			switch (self.icon()) {
				case "clear-day":
					return "wi-day-sunny";
				case "clear-night":
					return "wi-night-clear";
				case "rain":
					return "wi-rain";
				case "snow":
					return "wi-snow";
				case "sleet":
					return "wi-sleet";
				case "wind":
					return "wi-strong-wind";
				case "fog":
					return "wi-fog";
				case "cloudy":
					return "wi-cloudy";
				case "partly-cloudy-day":
					return "wi-day-cloudy";
				case "partly-cloudy-night":
					return "wi-night-alt-cloudy";
				default:
					return "wi-alien";

			}
		});	
		
		self.dayDisplay = ko.computed(function () {
			return self.day().format("ddd"); 
		});
		
		self.update = function (data) {
			self.tempCurrent(util.round(data.tempCurrent, 0));
			self.day(moment(data.day));
			self.summary(data.summary);
			self.summaryDetailed(data.summaryDetailed);
			self.icon(data.icon);
			self.tempHigh(util.round(data.tempHigh, 0));
			self.tempLow(util.round(data.tempLow, 0));
			self.windSpeed(data.windSpeed);
			self.precipChance(data.precipChance);
			self.precipType(data.precipType);	
		};
		
		
		if (typeof data !== "undefined" && null !== data) {
			self.update(data);
		}
	};
	
	return vm;
	
});