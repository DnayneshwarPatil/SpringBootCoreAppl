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

    @GetMapping("/dd")
    public String dod()
    {
        return "Software dd";
    }

    @GetMapping("/profile")
    public String profileCSI()
    {
        return "Software developer";
    }

    @GetMapping("/loan")
    public String loanmodule()
    {
        return "CSI LOAN MODULE";
    }








}
