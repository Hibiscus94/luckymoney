package com.mutou.luckymoney.controller;

import com.mutou.luckymoney.dao.Luckymoney;
import com.mutou.luckymoney.dao.LuckymoneyRepository;
import com.mutou.luckymoney.service.LuckymoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

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
public class LuckymoneyController {

    @Autowired
    private LuckymoneyRepository luckymoneyRepository;

    @Autowired
    private LuckymoneyService luckymoneyService;
    /**
     * 创建红包
     */
    @PostMapping("/luckymoneys")
    public Luckymoney create(@RequestParam("producer") String producer,
                             @RequestParam("money") BigDecimal money) {
        Luckymoney luckymoney = new Luckymoney();
        luckymoney.setProducer(producer);
        luckymoney.setMoney(money);
        return luckymoneyRepository.save(luckymoney);
    }

    /**
     * 通过id查询红包
     */
    @GetMapping("luckymoneys/{id}")
    public Luckymoney getById(@PathVariable("id") Integer id) {
        return luckymoneyRepository.findById(id).orElse(null);
    }

    /**
     * 更新红包
     */
    @PutMapping("luckymoneys/{id}")
    public Luckymoney update(@PathVariable("id") Integer id,
                             @RequestParam("consumer") String consumer) {
        Optional<Luckymoney> optional = luckymoneyRepository.findById(id);
        if (optional.isPresent()) {
            Luckymoney luckymoney = optional.get();
            luckymoney.setId(id);
            luckymoney.setComsumer(consumer);
            return luckymoneyRepository.save(luckymoney);
        }
        return new Luckymoney();
    }

    /**
     * 获取红包列表
     *
     * @return list
     */
    @GetMapping("/luckymoneys")
    public List<Luckymoney> luckymoneyList() {
        return luckymoneyRepository.findAll();
    }

    /**
     * 数据库声明式事物
     */
    @PostMapping("/luckymoneys/test")
    public void test(){
        luckymoneyService.createTwo();
    }
}
