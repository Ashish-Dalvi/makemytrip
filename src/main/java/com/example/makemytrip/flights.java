package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;

public class flights {
    @GetMapping("/flights")
    public String getData() {return "Please book flights from indigo ;"; }
}
