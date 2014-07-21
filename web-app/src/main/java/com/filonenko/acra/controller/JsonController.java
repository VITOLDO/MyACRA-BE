package com.filonenko.acra.controller;

import com.filonenko.acra.service.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created with IntelliJ IDEA.
 * User: Viktor
 * Date: 21.07.14
 * Time: 22:13
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class JsonController {
    public static final Logger LOG = LoggerFactory.getLogger(JsonController.class);

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "/json", method = RequestMethod.POST)
    @ResponseBody
    public String home(@RequestBody String text) {
        LOG.trace("text in controller is {}", text);
        try {
            mainService.create(text);
        } catch (Exception e) {
            LOG.error("Saving JSON Request failed due to {}", e);
            return "{status:\"Error\"}";
        }
        return "{status:\"Ok\"}";
    }
}
