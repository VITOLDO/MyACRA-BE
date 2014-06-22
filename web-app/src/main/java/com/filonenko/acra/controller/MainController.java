package com.filonenko.acra.controller;

import com.filonenko.acra.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Viktor, Filonenko
 * @since: 15.04.14
 */
@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(HttpServletRequest request) {
        request.getSession().setAttribute("hello","world");
        return "home";
    }
}
