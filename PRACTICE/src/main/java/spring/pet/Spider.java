package spring.pet;

import org.springframework.stereotype.Component;
import spring.interfaces.Animal;

@Component
public class Spider implements Animal {

    private String info = "Spider";
    @Override
    public String getInfo() {
        return info;
    }
}