package by.radkevich.spring.lesson13.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
//        Music classicalMusic = context.getBean("classicalMusicBean", Music.class);
//        System.out.println(classicalMusic.getSong());

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playSong(MusicStyle.ROCK);
        RockMusic rock = context.getBean("rockMusic", RockMusic.class);

        PopMusic pop = context.getBean("popMusic",PopMusic.class);

        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        context.close();
    }
}
