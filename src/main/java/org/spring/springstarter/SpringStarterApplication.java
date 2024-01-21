package org.spring.springstarter;

import org.spring.springstarter.sort.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStarterApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringStarterApplication.class, args);
        var binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        var binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch1 + " " + binarySearch);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        System.out.println(result);


    }

}
