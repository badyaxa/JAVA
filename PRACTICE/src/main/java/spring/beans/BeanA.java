package spring.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
    public BeanA() {
        System.out.println("Constructor BeanA: " + this.getClass().getSimpleName());
    }
}