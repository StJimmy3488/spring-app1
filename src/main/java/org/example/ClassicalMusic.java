package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }


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
