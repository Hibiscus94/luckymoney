package com.mutou.luckymoney.service;

import com.mutou.luckymoney.dao.Luckymoney;
import com.mutou.luckymoney.dao.LuckymoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * ,__,
 * (oo)_____
 * (__)     )\
 * ````||---|| *
 * com.mutou.luckymoney.service <br>
 * jdk 8
 *
 * @author mutou <br>
 * @version 1.0.0
 * @date 2019-05-12 <br>
 */
@Service
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository luckymoneyRepository;

    @Transactional
    public void createTwo(){
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("木头");
        luckymoney1.setMoney(new BigDecimal("520"));
        luckymoneyRepository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("木头");
        luckymoney2.setMoney(new BigDecimal("1314"));
        luckymoneyRepository.save(luckymoney2);
    }
}
