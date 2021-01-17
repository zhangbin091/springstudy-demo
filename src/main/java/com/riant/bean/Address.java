package com.riant.bean;

/**
 * @Classname Address
 * @Description TODO
 * @Date 2021/1/17 21:40
 * @Created by 张斌
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}

