package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/hello")
public class HelloController {

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String helloWithQueryParam(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    // Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name, Model model) {
        //String greeting = "Hello, " + name + "!"; gives same result if variable is put in as object below
        model.addAttribute("greeting", "Hello, " + name + "!");
        return "hello";
    }


    @GetMapping("form")
    public String helloForm() {
        return "form";
    }
    @GetMapping("hello-names")
    public String helloName(Model model) {
        List<String> names = new ArrayList<>();
        names.add("Launch Code");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";
    }

    @GetMapping("hello-num")
    public String helloNumbers(Model model) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(-8);
        nums.add(9);
        nums.add(3);
        model.addAttribute("nums", nums);
        return "hello-numlist";
    }


}