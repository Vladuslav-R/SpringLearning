package by.radkevich.spring.lesson13.annotation;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rockMusic")
public class RockMusic implements Music {


private List<String> rockPlayList = new ArrayList<>();

    {

      rockPlayList.add("Гни свою линию");
      rockPlayList.add("Варвара");
      rockPlayList.add("Ковер вертолёт");
    }

    public String getSong(int index) {

        return rockPlayList.get(index);
    }
}


