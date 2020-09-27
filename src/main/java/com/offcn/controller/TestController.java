package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @GetMapping("/set")
    public String setSession(HttpSession session){

        session.setAttribute("hello","world");
        return "ok";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        String hello = (String)session.getAttribute("hello");
        return hello;
    }
}
