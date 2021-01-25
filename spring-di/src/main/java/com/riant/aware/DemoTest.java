package com.riant.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname DemoTest
 * @Description TODO
 * @Date 2021/1/25 23:50
 * @Created by 张斌
 */
public class DemoTest {

    public static void main(String[] args) {
        testJavaConfig();

    }

    public static void testJavaConfig() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        ResourceAwareService resourceAwareService = applicationContext.getBean("resourceAwareService", ResourceAwareService.class);
        TestBean testBean = (TestBean) resourceAwareService.getBean("testBean");
        System.out.println(testBean.toString());
    }

    public static void xmlJavaConfig() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans5.xml");
        ResourceAwareService resourceAwareService = applicationContext.getBean("resourceAwareService", ResourceAwareService.class);
        TestBean testBean = (TestBean) resourceAwareService.getBean("testBean");
        System.out.println(testBean.toString());
    }
}
