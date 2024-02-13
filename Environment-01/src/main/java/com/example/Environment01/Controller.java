package com.example.Environment01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping("/getProperties")
    public String getProperties() {
        return environment.getProperty("myCustomVarTree.devName") + " il tuo authcode è : " + environment.getProperty("myCustomVarTree.authCode");
    }
}