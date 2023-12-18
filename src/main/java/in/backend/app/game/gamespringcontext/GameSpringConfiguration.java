package in.backend.app.game.gamespringcontext;

import in.backend.app.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class GameSpringConfiguration {

//    @Bean
//    public GamingConsole pacman() {
//        var pacMan = new PacMan();
//        return pacMan;
//    }
//
//    //The pacman game instance is used GameRunner below
//    @Bean
//    public GameRunner gameRunner(GamingConsole game) {
//        return new GameRunner(game);
//    }

    @Bean GameRunner marioGameRunner(){
        var mario = new MarioGame();
        return new GameRunner(mario);
    }

    @Bean @Primary GameRunner pacmanGameRunner(){
        var pacman = new PacMan();
        return new GameRunner(pacman);
    }

    @Bean("superContra") GameRunner superContra(){
        var superContra = new SuperContraGame();
        return new GameRunner(superContra);
    }

}
