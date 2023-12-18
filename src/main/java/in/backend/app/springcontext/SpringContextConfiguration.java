package in.backend.app.springcontext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//All the getter, setter & constructor & to String method of normal POJO based JAVA, can be created with 'record' keyword

record Person(String name, int age, Address address) {};
record Address(String city, String country) {};
@Configuration
public class SpringContextConfiguration {

    @Bean
    public String name(){
        return "Shahid";
    }
    @Bean
    public int age(){
        return 23;
    }
    @Bean
    public Person personDetails(){
        return new Person("Julia", 20, new Address("New York", "USA" ));
    }

    @Bean
    public Address addressDetails(){
        Address address = new Address("Bangalore", "India");
        return address;
    }

    //providing the custom name to bean, instead of function name
    @Bean("customBeanName")
    public Address address(){
        return new Address("Mumbai", "India");
    }

    //use the bean in relation with other beans
    @Bean
    public Person personRelationBean(){
        return new Person(name(), age(), address());
    }

    //creating a bean with parameterized values
    @Bean
    public Person personParameterized(String name, int age, Address addressDetails){
        return new Person(name, age, addressDetails);
    }

    //Similar method or custom bean name, tell explicitly that this is the primary bean to fetched
    @Bean
    @Primary
    public Person personExplictBean(){
        return new Person("Spring Explicit ", 12, address());
    }

    //another way to make the primary bean

    @Bean
    @Qualifier
    public Address addressQualifier(){
        return new Address("Qualifier address", "US");
    }
    @Bean
    public Person personQualifier(String name, int age, @Qualifier("addressQualifier") Address address){
        return new Person(name, age, address);
    }
}
