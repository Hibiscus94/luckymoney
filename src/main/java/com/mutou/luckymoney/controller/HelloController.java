package com.mutou.luckymoney.controller;

import com.mutou.luckymoney.config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * ,__,
 * (oo)_____
 * (__)     )\
 * ````||---|| *
 * com.mutou.luckymoney.controller <br>
 * jdk 8
 *
 * @author mutou <br>
 * @version 1.0.0
 * @date 2019-05-12 <br>
 */
@RestController
//@Controller
//@ResponseBody
@RequestMapping("/hello")
public class HelloController {
    //@Value("${minMoney}")
    //private BigDecimal minMoney;
    //
    //@Value("${description}")
    //private String description;

    @Autowired
    private LimitConfig limitConfig;

    //@GetMapping("/say/{id}")
    ////@RequestMapping(value = "/hello",method = RequestMethod.GET)
    //public String say(@PathVariable("id") Integer id) {
    //    //return "说明： " + limitConfig.getDescription();
    //    //return "index";
    //    return "id: " + id;
    //}

    @GetMapping("/say")
    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
        //return "说明： " + limitConfig.getDescription();
        //return "index";
        return "id: " + id;
    }
}
