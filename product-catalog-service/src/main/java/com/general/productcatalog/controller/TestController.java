package com.general.productcatalog.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testcheckMS")
    public String testCheckMS() {
        return "Test check Rest API MS success..!";
    }

    @QueryMapping
    public String testCheckMSGQL() {
        return "Test testCheckGQL MS success..!";
    }

}
