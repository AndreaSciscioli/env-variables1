package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
@RequestMapping("/get-properties")
public class MainController {
    @Value("${myCustomProps.authCode}")
    String authCode;
    @Value("${myCustomProps.devName}")
    String devName;
    @GetMapping("")
    public String getProperties(){

        return authCode + " " + devName;
    }

}
