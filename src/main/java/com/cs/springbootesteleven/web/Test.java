package com.cs.springbootesteleven.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Test {

    @RequestMapping(name = "/bootstarp",method = RequestMethod.GET)
    public String say(){
        return "BootstrapTestOne";

    }
}
