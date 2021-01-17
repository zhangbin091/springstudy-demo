package com.riant.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname DemoTest1
 * @Description TODO
 * @Date 2021/1/17 21:48
 * @Created by 张斌
 */
public class DemoTest1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");
        Student student =(Student)applicationContext.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.getAddress().getAddress());
        System.out.println(student.toString());
    }
}
