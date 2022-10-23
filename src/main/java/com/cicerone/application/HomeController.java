package com.cicerone.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("home")
    @ResponseBody
    public String home(HttpServletRequest req){
        String name=req.getParameter("name");
         return "home name= " +name;
    }
}
