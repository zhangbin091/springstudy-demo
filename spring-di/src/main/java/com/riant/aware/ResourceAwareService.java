package com.riant.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @Classname ResourceAwareService
 * @Description TODO
 * @Date 2021/1/23 23:38
 * @Created by 张斌
 */
@Service
public class ResourceAwareService implements ResourceLoaderAware, BeanNameAware, BeanFactoryAware, BeanPostProcessor, InitializingBean, DisposableBean {
    private String beanName;
    private ResourceLoader resourceLoader;
    private BeanFactory beanFactory;
    public void setBeanName(String beanName) {
        System.out.println("初始化 ResourceAwareService");
        this.beanName =beanName;
    }


    public void setResourceLoader(ResourceLoader resourceLoader) {
    this.resourceLoader = resourceLoader;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("获取beanFactory");
        this.beanFactory = beanFactory;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    public void afterPropertiesSet() throws Exception {

    }

    public void destroy() throws Exception {
        System.out.println("销毁ResourceAwareService");
    }

    public Object getBean(String name){
        return beanFactory.getBean(name);
    }
}
