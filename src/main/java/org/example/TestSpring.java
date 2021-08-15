package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {


//        List<String> trackName = new ArrayList<String>();
//        trackName.add("Dance of Knights");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("rockMusic", Music.class);
//        MusicPlayer rockMusicPlayer = new MusicPlayer(music2);
//        rockMusicPlayer.playMusic();


//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic(MyEnum.CLASSICAL);
//        musicPlayer.playMusic(MyEnum.ROCK);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        context.close();


    }
}
