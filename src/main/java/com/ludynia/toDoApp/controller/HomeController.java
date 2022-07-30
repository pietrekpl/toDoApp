package com.ludynia.toDoApp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public ModelAndView index(){
        logger.debug("Request index page");
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;

    }
}
