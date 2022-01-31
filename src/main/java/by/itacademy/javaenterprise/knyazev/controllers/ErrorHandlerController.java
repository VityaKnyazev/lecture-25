package by.itacademy.javaenterprise.knyazev.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
class ErrorHandlerController {
	@ExceptionHandler(Exception.class)
	public ModelAndView handleExceptions(Exception e) {
		ModelAndView modelAndView = new ModelAndView("error");
		  modelAndView.addObject("message", e.getMessage());
		  return modelAndView;
	}
}