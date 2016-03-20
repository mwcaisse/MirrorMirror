package com.ricex.mirrormirror.web.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ricex.mirrormirror.web.manager.FortuneManager;
import com.ricex.mirrormirror.web.viewmodel.ResponseViewModel;

@Controller
@RequestMapping(value = "/api/fortune")
public class FortuneApiController extends ApiController {
	
	private FortuneManager manager;
	
	public FortuneApiController(FortuneManager manager) {
		this.manager = manager;
	}

	@RequestMapping(value="/", method=RequestMethod.GET, produces={JSON})
	public @ResponseBody ResponseViewModel<String> get() {	
		return new ResponseViewModel<String>(manager.getFortune());
	}
	
}
