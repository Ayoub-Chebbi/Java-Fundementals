package com.dakichi.routes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DakichiController {
    // you can be explicit about the request as well
    @RequestMapping(value="/daikichi", method=RequestMethod.GET)
    public String hello(){
      return "Welcome";
    }
    @RequestMapping(value="/daikichi/today", method=RequestMethod.GET)
    public String display(){
      return "Today you will find luck in all your endeavors!";
    }
    @RequestMapping(value="/daikichi/tomorrow", method=RequestMethod.GET)
    public String display2(){
      return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}