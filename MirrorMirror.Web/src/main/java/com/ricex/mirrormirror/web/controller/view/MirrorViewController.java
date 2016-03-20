package com.ricex.mirrormirror.web.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/mirror/")
public class MirrorViewController extends ViewController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView mirrorHome() {
		return new ModelAndView("mirror/index");
	}
	
}
