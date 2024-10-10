package com.example.demo;

import com.example.demo.store.Store;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TestController {
    @RequestMapping("/java")
    @ResponseBody
    public String test() throws InterruptedException {
        Thread.sleep(10000);
        return "java";
    }
    //get 메소드로 /name 으로 이름 출력하느 것 만들어보세요.
    @GetMapping("/name")
    @ResponseBody
    public String test2() {
        return "조경준";
    }
}
