package spring.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    public BeanB() {
        System.out.println("Constructor BeanB: " + this.getClass().getSimpleName());
    }
}