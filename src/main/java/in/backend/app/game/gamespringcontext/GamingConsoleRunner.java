package in.backend.app.game.gamespringcontext;

import in.backend.app.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("in.backend.app.game")
public class GamingConsoleRunner {

//    @Bean
//    @Primary
//    public GameRunner gameRunner(GamingConsole game){
//        System.out.println("game -> " + game);
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }

    //The above can be created by adding @componentScan at gameRunner class
    public static void main(String[] args) {

        try (
                var context = new AnnotationConfigApplicationContext(GamingConsoleRunner.class)
        ) {

            context.getBean(GameRunner.class).run();

//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }
    }
}
