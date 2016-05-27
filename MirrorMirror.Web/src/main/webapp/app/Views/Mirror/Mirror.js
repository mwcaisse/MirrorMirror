"use strict";

define("Views/Mirror/Mirror", 
	["Modules/DateTime/DateTime",
	 "Modules/Fortune/Fortune",
	 "Modules/Weather/Weather",
	 "Service/util", 
	 "AMD/koTemplateLoader!Views/Mirror/Mirror.html"], function (dateTime, fortune, weather, util) {
	
	var vm = function() {
		var self = this;

		self.dateTime = new dateTime();
		self.fortune = new fortune();
		self.weather = new weather();
		
		self.dateTime.load();
		self.fortune.load();
		self.weather.load();
	};
	
	return vm;
	
});