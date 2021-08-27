package org.example;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    //    public String genreName = String.valueOf(ClassicalMusic.class.getClass());
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    private List<Music> musicList;


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();


        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSongs() + " with volume " + this.volume;

    }
}