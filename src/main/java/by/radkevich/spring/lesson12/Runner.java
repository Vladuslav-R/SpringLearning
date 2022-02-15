package by.radkevich.spring.lesson12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
musicPlayer.playSong(MusicStyle.ROCK);
    }
}
