package com.globant.bootcamp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    private static final String errorPath = "/error";

    @RequestMapping(value = errorPath)
    public String error() {
        return "Error handling";
    }

    public String getErrorPath() {
        return errorPath;
    }
}
