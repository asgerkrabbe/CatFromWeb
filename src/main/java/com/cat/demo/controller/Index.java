package com.cat.demo.controller;


import com.cat.demo.service.Services;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class Index {
    Services services = new Services();

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/getSingle")
    @ResponseBody
    public String getSingle() throws IOException {
        return "" + services.webReader();
    }

    @GetMapping("/getTen")
    @ResponseBody
    public String getTen() throws IOException {
        return "" + services.tenCatFact();
    }

    @GetMapping("getTenSortByDate")
    public String getTenSortByDate() {
        return "getTenSortByDate";
    }

    @GetMapping("/contains")
    public String contains(@RequestParam int x, char a) {
        return "contains";
    }
}
