package spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import spring.pet.Cheetah;
import spring.pet.Spider;

@Configuration
@ComponentScan(basePackages = "spring.pet",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Spider.class))
public class PetConfig {
// beans creates one by one in the order they are declared
    @Bean
    @Qualifier("cheetah3")
    public Cheetah getCheetahWithQualifier() {
        return new Cheetah("@Qualifier(\"cheetah3\")");
    }

    @Bean
    @Primary
    public Cheetah getPrimaryCheetah() {
        return new Cheetah("@Primary Cheetah");
    }
}