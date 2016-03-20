"use strict";

define("Views/Mirror/Mirror", 
	["Modules/DateTime/DateTime",
	 "Modules/Fortune/Fortune",
	 "Service/util", 
	 "AMD/koTemplateLoader!Views/Mirror/Mirror.html"], function (dateTime, fortune, util) {
	
	var vm = function() {
		var self = this;

		self.dateTime = new dateTime();
		self.fortune = new fortune();
		
		self.dateTime.load();
		self.fortune.load();
	};
	
	return vm;
	
});