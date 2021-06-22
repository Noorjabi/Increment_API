package com.assignment.increment.controller;


import com.assignment.increment.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/number")
public class NumberController {
    @Autowired
    NumberService numberService;

    @GetMapping("")
    public void increment() {
         numberService.incrementNUmber();
    }
}

