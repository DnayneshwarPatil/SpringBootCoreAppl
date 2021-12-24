package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping("/csi")

    public  String sayHello()
    {
        return "WELCOME TO CSI";
    }

    @GetMapping("/address")
    public String addressCSI()
    {
        return "INSPIRAL MALL PUNE";
    }

    @GetMapping("/profile")
    public String profileCSI()
    {
        return "Software developer";
    }







}
