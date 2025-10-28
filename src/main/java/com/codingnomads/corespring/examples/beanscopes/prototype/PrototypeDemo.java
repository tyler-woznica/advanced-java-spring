/* CodingNomads (C)2024 */
package com.codingnomads.corespring.examples.beanscopes.prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(PrototypeDemoConfig.class);
        ctx.refresh();

        SpringBean springBean1 = ctx.getBean(SpringBean.class);
        System.out.println("Hash code: " + springBean1.hashCode());

        SpringBean springBean2 = ctx.getBean(SpringBean.class);
        System.out.println("Hash code: " + springBean2.hashCode());

        SpringBeen springBeen1 = ctx.getBean(SpringBeen.class);
        System.out.println("Hash code: " + springBeen1.hashCode());

        SpringBeen springBeen2 = ctx.getBean(SpringBeen.class);
        System.out.println("Hash code: " + springBeen2.hashCode());

        ctx.close();
    }
}
