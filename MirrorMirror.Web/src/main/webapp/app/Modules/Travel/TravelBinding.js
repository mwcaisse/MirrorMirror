"use strict";

define("Modules/Travel/TravelBinding", 
		["Service/koBindingHandlers", "AMD/koTemplateLoader!Modules/Travel/Travel.html"], 
		function (handlers, templateName) {	
	
	handlers.createBindingHandler("travel", templateName);
});