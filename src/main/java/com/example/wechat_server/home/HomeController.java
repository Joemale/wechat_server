package com.example.wechat_server.home;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HomeController {

        @RequestMapping("/hello")
        @ResponseBody
        public String hello(){
            return "hello home";
        }

}
