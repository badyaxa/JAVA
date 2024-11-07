package spring.pet;

import java.util.List;
import org.springframework.stereotype.Component;
import spring.interfaces.Animal;

@Component
public class Pet {
    private List<Animal> animals;

    //    @Autowired(it is not necessary to put this annotation over the constructor)
    public Pet(List<Animal> animals) {
        this.animals = animals;
    }

    public void printPets() {
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + " " + animal.getInfo());
        }
    }

    private String info = "Pet";
    public String getInfo() {
        return info;
    }
}