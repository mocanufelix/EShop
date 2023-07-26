package com.demo.EShop.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping(value = "/printHello")
    @ResponseBody
    public String printHello() {
        return "Hello World";
        // cautam in browser: printHello
        // response: Hello World
    }

    @GetMapping(value = "/printParam")
    @ResponseBody
    public String printParam(@RequestParam("username") String name) {
        return "Hello " + name;
        // cautam in browser printParam?username=Ana
        // response: Hello Ana
    }

    // path variable
    @GetMapping(value = "/printPathVariable/{country}/index")
    @ResponseBody
    public String printPathVariable(@PathVariable String country) {
        return "Site country " + country;
        // cautam in browser printPathValue/fr/index
        // response: Sitecountry fr
    }

}

