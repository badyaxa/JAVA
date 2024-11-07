package spring.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.beans.BeanC;

@Component
public class OtherBeanC {
    private String info = "@Autowired on field";

    @Autowired
    private BeanC beanC;

    public OtherBeanC() {
        System.out.println("NoArgsConstructor OtherBeanC. private BeanC beanC: " + beanC + " was injected through the " + info);
    }


}