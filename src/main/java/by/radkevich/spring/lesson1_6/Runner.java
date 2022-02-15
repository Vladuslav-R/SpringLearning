package by.radkevich.spring.lesson1_6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

 Music music = context.getBean("music", Music.class);
 MusicPlayer musicPlayer =context.getBean("musicPlayer", MusicPlayer.class );
        musicPlayer.playSong();

TestSpring test = context.getBean("test", TestSpring.class);
        System.out.println(test.getName() + " " +  test.getVolume());
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
    }
}
