package org.example;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {
    private List<String> trackName = new ArrayList<>();

    {
        trackName.add("Summertime");  //by John Coltrane
    }

    @Override
    public List<String> getSongs() {
        return trackName;
    }
}
