package com.example.web;

import com.example.bean.People;
import com.example.service.AccountService;
import com.example.service.DatabaseAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;




@RestController
public class PeopelController {
    @Autowired
	public AccountService accountService;

//    @RequestMapping("/{name}")
//    public People view(@PathVariable("name") String name) {
//        People people = new People();
//        accountService.sout();
//        people.setName(name);
//        System.out.println(name);
//        return people;
//    }

//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }
}
