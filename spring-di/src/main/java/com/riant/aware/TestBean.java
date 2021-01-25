package com.riant.aware;

/**
 * @Classname TestBean
 * @Description TODO
 * @Date 2021/1/25 23:46
 * @Created by 张斌
 */
public class TestBean {
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                '}';
    }
}

