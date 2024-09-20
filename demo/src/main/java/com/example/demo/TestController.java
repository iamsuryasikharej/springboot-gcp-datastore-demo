package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @Autowired
    BrowserHistoryRepo browserHistoryRepo;

    @GetMapping("/test")
    public void test()
    {
        BrowserHistory history = new BrowserHistory();
        history.setName("test");
        history.setUrl("http://working");
        browserHistoryRepo.save(history);
    }
}
