package in.backend.app.game.gamespringcontext;

import in.backend.app.game.*;
import org.springframework.context.annotation.*;

import java.util.Arrays;

@Configuration
@ComponentScan("in.backend.app.game")
public class GamingConsoleContext {

    @Bean
    @Primary
    public GameRunner gameRunner(GamingConsole game){
        System.out.println("game -> " + game);
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    public static void main(String[] args) {

        try (
                var context = new AnnotationConfigApplicationContext(GamingConsoleContext.class)
        ) {

            context.getBean(GameRunner.class).run();


            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }
    }
}
