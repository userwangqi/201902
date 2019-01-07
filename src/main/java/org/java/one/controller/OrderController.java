package org.java.one.controller;

import org.java.one.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/one")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/queryIndentAll")
    public String queryIndentAll(){
        List<Map> queryIndentList=orderService.queryIndentAll();
        for (Map item :
                queryIndentList) {
            System.out.println(item);
        }
        return "/one/index";
    }

}
