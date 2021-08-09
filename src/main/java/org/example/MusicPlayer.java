package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component

public class MusicPlayer {
    MyEnum myEnum = MyEnum.ROCK;
    MyEnum myEnum1 = MyEnum.CLASSICAL;
    private Music music1;
    private Music music2;


    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public void playMusic(MyEnum genre) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (genre == MyEnum.CLASSICAL) {
            System.out.println(music1.getSongs().get(randomNumber));
        } else {
            System.out.println(music2.getSongs().get(randomNumber));
        }

    }
}