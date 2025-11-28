package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;

public class bus {
    @GetMapping("/bus")
    public String getData() {return "Please book bus from indigo ;"; }
}
