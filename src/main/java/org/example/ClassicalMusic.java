package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ClassicalMusic implements Music {
    private List<String> trackName = new ArrayList<>();

    {
        trackName.add("Dance of Knights");
        trackName.add("Suite Nr.1 ");
        trackName.add("In the Hall of Mountain King ");
    }


    @Override
    public List<String> getSongs() {
        return trackName;
    }
}
