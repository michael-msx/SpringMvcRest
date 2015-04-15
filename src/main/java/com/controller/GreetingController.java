package com.controller;

import com.domain.Message;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Shixuan on 2015/4/13.
 */

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "greeting",method = RequestMethod.GET)
    public Message greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Message(counter.incrementAndGet(),String.format(template,name));
    }

}
