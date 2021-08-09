package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> trackName = new ArrayList<>();

    {
        trackName.add("Stairway to heaven");
        trackName.add("Paradise City");
        trackName.add("House of Rising Sun");
    }


    @Override
    public List<String> getSongs() {
        return trackName;
    }
}
