package spring.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.beans.BeanB;

@Component
public class OtherBeanB {
    private String info = "@Autowired Setter";

    private BeanB beanB;

    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
        System.out.println("Setter OtherBeanB: " + this.getClass().getSimpleName() + " has " + beanB.getClass().getSimpleName() + " that was injected through the " + info);
    }
}