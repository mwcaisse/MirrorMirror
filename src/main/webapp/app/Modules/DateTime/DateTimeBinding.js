"use strict";

define("Modules/DateTime/DateTimeBinding", 
		["Service/koBindingHandlers", "AMD/koTemplateLoader!Modules/DateTime/DateTime.html"], 
		function (handlers, templateName) {	
	
	handlers.createBindingHandler("dateTime", templateName);
});