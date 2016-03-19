"use strict";

define("Service/koBindingHandlers", [], function () {
	
	var handlers = new (function() {
		var self = this;

		self.customTemplateInit = function (element, valueAccessor, allBindings, viewModel, bindingContext) {			
			ko.virtualElements.emptyNode(element);
		};
		
		self.customTemplateUpdate = function (templateName, element, valueAccessor, allBindings, viewModel, bindingContext) {	
			var accessor = valueAccessor();
			var template = ko.renderTemplate(templateName, accessor, {}, element, "replaceNode");
		};
		
	})();
	
	return handlers;
	
});