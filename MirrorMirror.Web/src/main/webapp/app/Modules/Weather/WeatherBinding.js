"use strict";

define("Modules/Weather/WeatherBinding", 
		["Service/koBindingHandlers", "AMD/koTemplateLoader!Modules/Weather/Weather.html"], 
		function (handlers, templateName) {	
	
	handlers.createBindingHandler("weather", templateName);
});