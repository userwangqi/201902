package org.java.three.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//初始化请求
@Controller
public class FristController {
    //该请求进入主界面
        @RequestMapping("/frist")
        private String frist(){
            //222
            System.out.println("进入主界面");
            return  "/three/index";
        }

}
