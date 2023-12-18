package in.backend.app.springcontext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContext {

    public static void main(String[] args) {

        //try with resources to close the context : to avoid the leaks in JVM
        try (var context =
                     new AnnotationConfigApplicationContext(SpringContextConfiguration.class)) {

            /*
             * 1) Launch a Spring context
             * 2) Configure the things using Spring-Configurations - @Configuration in SpringContextConfiguration Class
             * 3) Spring beans, they are simply the POJO based Java object */


            //retrieving the spring beans
            System.out.println(context.getBean("name"));

            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("personDetails"));

            System.out.println(context.getBean("addressDetails"));

            //calling the bean with custom name, instead of method name
            System.out.println(context.getBean("customBeanName"));

            //retrieving using the type such as class, retries all the beans
//        System.out.println(context.getBean(Address.class));

            //Note : if class has method bean & customNamed bean,
            // then retrieving by using type className.class then -> NoUniqueBeanDefinitionException Exception

            //Inorder to use this, need to tell spring explictly that we need the primary bean
            System.out.println(context.getBean("personExplictBean"));

            //calling the relationship beans
            System.out.println(context.getBean("personRelationBean"));


            //calling the parameterized bean
            System.out.println(context.getBean("personParameterized"));

            //calling the Qualifier bean
            System.out.println(context.getBean("personQualifier"));

            //calling all the spring beans
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);
        }


    }
}
