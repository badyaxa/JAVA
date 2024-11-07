package spring.pet;

import org.springframework.stereotype.Component;
import spring.interfaces.Animal;

@Component
public class Cheetah implements Animal {

    public Cheetah() {
    }

    public Cheetah(String info) {
        this.info = info;
    }

    private String info = "Cheetah";
    @Override
    public String getInfo() {
        return info;
    }
}