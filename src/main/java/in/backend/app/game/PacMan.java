package in.backend.app.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GamingConsole{


    @Override
    public void up() {
        System.out.println("Running up side..");
    }

    @Override
    public void down() {
        System.out.println("Running down ");
    }

    @Override
    public void left() {
        System.out.println("Run to the left...");

    }

    @Override
    public void right() {
        System.out.println("Run to the right..");
    }
}
