package spring.pet;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.interfaces.Animal;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class Dog implements Animal {

    private String info = "@Order(Ordered.HIGHEST_PRECEDENCE)";
    @Override
    public String getInfo() {
        return info;
    }
}