"use strict";

define("Views/Mirror/Mirror", 
	["Modules/DateTime/DateTime",
	 "Service/util", 
	 "AMD/koTemplateLoader!Views/Mirror/Mirror.html"], function (dateTime, util) {
	
	var vm = function() {
		var self = this;

		self.dateTime = new dateTime();		
		
	};
	
	return vm;
	
});