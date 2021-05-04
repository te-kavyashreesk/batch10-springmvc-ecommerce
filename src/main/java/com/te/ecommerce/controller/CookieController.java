package com.te.ecommerce.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/cookies")
public class CookieController {
	
	@GetMapping("/cookiepage")
	public String getCookiePage() {
		return "cookie";	
		}
	
	@GetMapping("/createCookie")
	public String createCookie(ModelMap map, HttpServletResponse response) {
		Cookie cookie = new Cookie("technoelevate","batch10");
		response.addCookie(cookie);
		map.addAttribute("msg", "Cookies Created Successfully");
		return "cookie";
	}
	
	@GetMapping("/showCookie")
	public String getCookies(@CookieValue(name="technoelevate", required = false) String value ,ModelMap map) {
		if(value !=null) {
			map.addAttribute("msg", "cookies found");
			map.addAttribute("cookieValue", value);
		}
		return "cookie";
	}

}