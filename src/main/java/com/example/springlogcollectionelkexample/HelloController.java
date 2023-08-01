package com.example.springlogcollectionelkexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("ok")
    public String ok() {
        return "ok";
    }

    @GetMapping("log")
    public String log() {
        log.info("log");
        return "log";
    }

    @GetMapping("error")
    public String error() {
        throw new IllegalArgumentException();
    }
}
