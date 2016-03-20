package com.ricex.mirrormirror.web.controller.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;

import com.ricex.mirrormirror.web.controller.BaseController;


public abstract class ApiController extends BaseController {

	private static Logger log = LoggerFactory.getLogger(ApiController.class);

	protected static final String JSON = MediaType.APPLICATION_JSON_VALUE;
	
}
