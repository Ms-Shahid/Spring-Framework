package in.backend.app.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{

    public void up(){
        System.out.println("Jump 🧐");
    }

    public void down(){
        System.out.println("Sit down 🧐");
    }

    public void left(){
        System.out.println("running 🧐");
    }

    public void right(){
        System.out.println("Shoot a bullet 🧐");
    }
}
