package in.backend.app.game.gamespringcontext;

import in.backend.app.game.GameRunner;
import in.backend.app.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class GamingConsoleContext {

    public static void main(String[] args) {

        try(
                var context = new AnnotationConfigApplicationContext(GameSpringConfiguration.class)
                ){

//            context.getBean(GameRunner.class).run();

//            context.getBean(GamingConsole.class).up();

//            System.out.println(context.getBean("pacman"));
//            System.out.println(context.getBean("CustomMarioGame"));
//            System.out.println(context.getBean("superContra"));
//
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);

        }
    }
}
