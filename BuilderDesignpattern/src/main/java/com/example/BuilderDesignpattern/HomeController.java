package com.example.BuilderDesignpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    private static final Logger logger= LogManager.getLogger(HomeController.class);
    private List<Integer>num= Arrays.asList(1,2,3,4);

    @GetMapping("/")
    public String calculate(Model model)
    {

        logger.error("hello from log4j 2 - num:{}",()->num);

        return "welcome";
    }



}
