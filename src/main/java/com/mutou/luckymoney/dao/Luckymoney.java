package com.mutou.luckymoney.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * ,__,
 * (oo)_____
 * (__)     )\
 * ````||---|| *
 * com.mutou.luckymoney.dao <br>
 * jdk 8
 *
 * @author mutou <br>
 * @version 1.0.0
 * @date 2019-05-12 <br>
 */
@Entity
public class Luckymoney {
    @Id
    @GeneratedValue
    private Integer id;

    private BigDecimal money;

    /**
     * 发送方
     */
    private String producer;

    /**
     * 接收方
     */
    private String comsumer;

    public Luckymoney() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getComsumer() {
        return comsumer;
    }

    public void setComsumer(String comsumer) {
        this.comsumer = comsumer;
    }
}
