package by.radkevich.spring.lesson13.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
@Value("${musicPlayer.name}")
    String name;
    @Value("${musicPlayer.volume}")
private int volume;
List<MusicStyle> playList = new ArrayList<>();

    {
        playList.add(MusicStyle.POP);
        playList.add(MusicStyle.ROCK);
        playList.add(MusicStyle.CLASSICAL);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    Music music;
    Music music1;
    MusicStyle musicStyle = MusicStyle.POP;
    Random random = new Random();
    int rand = random.nextInt(3);


@Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music, @Qualifier("popMusic") Music music1) {
        this.music = music;
        this.music1 = music1;
        System.out.println();
    }

    public void playSong(MusicStyle musicStyle) {

        switch (musicStyle) {
            case POP:
                System.out.println(music1.getSong(rand));
                break;
            case ROCK:
                System.out.println(music.getSong(rand));
                break;
            default:
                System.out.println("Пшел вон");


        }
        System.out.println(rand);
    }
}



