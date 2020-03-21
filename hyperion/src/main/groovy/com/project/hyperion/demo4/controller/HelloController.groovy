package com.project.hyperion.demo4.controller

import com.project.hyperion.demo4.pogo.army.Infantry
import com.project.hyperion.demo4.pogo.army.Unit
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
public class HelloController {


    @GetMapping("/hello")
    public Unit hello() {
        Unit infantry = new Infantry()
        return infantry
    }
}