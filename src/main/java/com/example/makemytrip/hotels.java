package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;

public class hotels {
    @GetMapping("/hotels")
    public String getData() {return "Please book hotels from indigo ;"; }
}
