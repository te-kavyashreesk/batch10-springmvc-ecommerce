package com.te.ecommerce.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.ecommerce.custoexp.ItemException;

@ControllerAdvice
	public class ItemControllerAdvice {

		@ExceptionHandler(ItemException.class)
		public String handleExp(ItemException exception, HttpServletRequest request) {
			request.setAttribute("expMsg", exception.getMessage());
			return "header";
		}

}
