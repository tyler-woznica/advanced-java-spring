package com.codingnomads.corespring.examples.springbeanlifecycle;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements BeanNameAware {

    @Override
    public void setBeanName(@NotNull String name) {
        System.out.println("This test bean name is now set to: " + name);
    }
}
