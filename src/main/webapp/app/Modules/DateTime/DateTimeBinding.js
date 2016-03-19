"use strict";

define("Modules/DateTime/DateTimeBinding", ["Service/koBindingHandlers", "AMD/koTemplateLoader!Modules/DateTime/DateTime.html"], function (handlers, templateName) {	
	ko.bindingHandlers.dateTime = {
		init: handlers.customTemplateInit,
		update: function (element, valueAccessor, allBindings, viewModel, bindingContext) {	
			handlers.customTemplateUpdate(templateName, element, valueAccessor, allBindings, viewModel, bindingContext);
		}
	};	
});