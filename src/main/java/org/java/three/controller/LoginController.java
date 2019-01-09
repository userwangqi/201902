package org.java.three.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")
    private  String longinGo(){
        //2222//333
        System.out.println("login");
        return  "/three/login";
    }

    @RequestMapping("/Goindex")
    private  String index(){
        return  "/three/index";
    }


}
