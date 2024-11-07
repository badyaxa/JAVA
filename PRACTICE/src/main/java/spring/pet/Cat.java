package spring.pet;

import org.springframework.stereotype.Component;
import spring.interfaces.Animal;

@Component
public class Cat implements Animal {
    private String info = "Cat";

    @Override
    public String getInfo() {
        return info;
    }
}