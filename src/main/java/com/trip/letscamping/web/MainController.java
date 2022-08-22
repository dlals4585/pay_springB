package com.trip.letscamping.web;

import com.trip.letscamping.web.vo.MainResponseVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/hello/dto")
    public MainResponseVO hellodto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new MainResponseVO(name,amount);
        //http://localhost:8080/hello/dto?name=leehyungang&amount=1
    }
}
