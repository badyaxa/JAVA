package spring.other;

import org.springframework.stereotype.Component;
import spring.beans.BeanA;

@Component
public class OtherBeanA {
    private String info = "@Autowired Constructor";

    private BeanA beanA;

    //    @Autowired (it is not necessary to put this annotation over the constructor)
    public OtherBeanA(BeanA beanA) {
        this.beanA = beanA;
        System.out.println("AllArgsConstructor OtherBeanA: " + this.getClass().getSimpleName() + " has " + beanA.getClass().getSimpleName() + " that was injected through the " + info);
    }
}