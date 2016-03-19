"use strict";

define("Views/Mirror/Mirror", ["AMD/koTemplateLoader!Views/Mirror/Mirror.html"], function (text) {
	
	var vm = function() {
		var self = this;
		
		self.text = ko.observable("Here is my awesome text!");
		
		self.click = function() {
			alert("You clicked me!");
		};
		
	};
	
	return vm;
	
});