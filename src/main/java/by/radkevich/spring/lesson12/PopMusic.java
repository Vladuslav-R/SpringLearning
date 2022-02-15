package by.radkevich.spring.lesson12;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {

    private List<String> popPlayList = new ArrayList<>();

    {
        popPlayList.add("попса1");
        popPlayList.add("попса2");
        popPlayList.add("попса3");
    }
    @Override
    public String getSong(int index) {

        return popPlayList.get(index);
    }
}
