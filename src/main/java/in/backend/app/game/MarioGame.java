package in.backend.app.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{


    public void up(){
        System.out.println("Jump 🧐");
    }

    public void down(){
        System.out.println("down 😍");
    }
    public void left(){
        System.out.println("going left 🧐");
    }
    public void right(){
        System.out.println("going right 😭");
    }
}
