package com.te.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDeligation {
	@GetMapping("/redirect")
	public String redirectExample() {
		return"redirect:https://google.com"; // use redirect: then provide link where to redirect
	}
	
	@GetMapping("/forward")
	public String forwardExample() {
		return"forward:/adminLogin"; // use forward: then provide link where to forward
	}

}
