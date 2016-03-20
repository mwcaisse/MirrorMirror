"use strict";

define("Modules/Fortune/FortuneBinding", 
		["Service/koBindingHandlers", "AMD/koTemplateLoader!Modules/Fortune/Fortune.html"], 
		function (handlers, templateName) {	
	
	handlers.createBindingHandler("fortune", templateName);
});