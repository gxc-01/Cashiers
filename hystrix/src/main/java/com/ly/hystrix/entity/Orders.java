package com.ly.hystrix.entity;

import javax.xml.crypto.Data;

public class Orders
{
    private  Integer id;
    private String orderData;
    private int orderId;
    private String payment;
    private String type;
    private int state;
    private String ordermoney;
    private String promotion;
    private String member;
    private String netmoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderData() {
        return orderData;
    }

    public void setOrderData(String orderData) {
        this.orderData = orderData;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(String ordermoney) {
        this.ordermoney = ordermoney;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getNetmoney() {
        return netmoney;
    }

    public void setNetmoney(String netmoney) {
        this.netmoney = netmoney;
    }
}
