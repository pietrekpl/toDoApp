package com.ludynia.toDoApp.controller;


import com.ludynia.toDoApp.repository.ToDoItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    private ToDoItemRepository toDoItemRepository;

    public HomeController(ToDoItemRepository toDoItemRepository) {
        this.toDoItemRepository = toDoItemRepository;
    }

    @GetMapping("/")
    public ModelAndView index(){
        logger.debug("Request index page");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todoItems",toDoItemRepository.findAll());
        return modelAndView;

    }
}
