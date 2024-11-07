package spring.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
    public BeanC() {
        System.out.println("Constructor BeanC: " + this.getClass().getSimpleName());
    }
}