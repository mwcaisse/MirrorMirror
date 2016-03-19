package com.ricex.mirrormirror.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ricex.mirrormirror.manager.FortuneManager;
import com.ricex.mirrormirror.viewmodel.ResponseViewModel;

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
