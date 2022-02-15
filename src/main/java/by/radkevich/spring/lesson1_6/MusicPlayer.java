package by.radkevich.spring.lesson1_6;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
private int volume;
private String name;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Music> playList = new ArrayList<>();

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }

    MusicPlayer () {

    }

    public void playSong () {
        for(Music music:playList)
        System.out.println("Играет: " + music.getSong() );
    }

}
