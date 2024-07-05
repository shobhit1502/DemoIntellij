package com.lcwd.first.controllers;

import com.lcwd.first.config.LCWDConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class HomeController {
    @Value("${lcwd.profile.image.path}")
    private String profilePath;

    @Autowired
    private LCWDConfig lcwdConfig;
    @RequestMapping("/todos")
     public List<String> justTest(){
         List<String> todos = new ArrayList<>();
         todos.add("Learn java   tbhynjumkyjtynhbtgvbh...");
         todos.add("Learn springBoot...");
         todos.add("Make projects...");


         //List<String> todos = Arrays.asList("Hello","hii","byeee")
         return todos;

     }

     @RequestMapping("/profile-path")
     public String getProfilePath(){
        return profilePath;
     }
   @RequestMapping("/lcwd-config")
    public LCWDConfig getLcwdConfig() {
        return this.lcwdConfig;
    }
}
