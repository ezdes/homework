package Task_B;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Song song = new Song("Let Her Go", "Passenger", "Alternative/Indie", "" +
                "Well, you only need the light when it's burning low\n" +
                "Only miss the sun when it starts to snow\n" +
                "Only know you love her when you let her go\n" +
                "Only know you've been high when you're feeling low\n" +
                "Only hate the road when you're missing home\n" +
                "Only know you love her when you let her go\n" +
                "And you let her go\n" +
                "Staring at the bottom of your glass\n" +
                "Hoping one day you'll make a dream last\n" +
                "But dreams come slow, and they go so fast\n" +
                "You see her when you close your eyes\n" +
                "Maybe one day, you'll understand why\n" +
                "Everything you touch surely dies\n" +
                "But you only need the light when it's burning low\n" +
                "Only miss the sun when it starts to snow\n" +
                "Only know you love her when you let her go\n" +
                "Only know you've been high when you're feeling low\n" +
                "Only hate the road when you're missing home\n" +
                "Only know you love her when you let her go\n" +
                "Staring at the ceiling in the dark\n" +
                "Same old empty feeling in your heart\n" +
                "'Cause love comes slow, and it goes so fast\n" +
                "Well, you see her when you fall asleep\n" +
                "But never to touch and never to keep\n" +
                "'Cause you loved her too much, and you dived too deep\n" +
                "Well, you only need the light when it's burning low\n" +
                "Only miss the sun when it starts to snow\n" +
                "Only know you love her when you let her go\n" +
                "Only know you've been high when you're feeling low\n" +
                "Only hate the road when you're missing home\n" +
                "Only know you love her when you let her go\n" +
                "And you let her go\n" +
                "Oh, oh, mm, oh\n" +
                "And you let her go\n" +
                "Oh, oh, uh, uh\n" +
                "Well, you let her go\n" +
                "'Cause you only need the light when it's burning low\n" +
                "Only miss the sun when it starts to snow\n" +
                "Only know you love her when you let her go\n" +
                "Only know you've been high when you're feeling low\n" +
                "Only hate the road when you're missing home\n" +
                "Only know you love her when you let her go\n" +
                "'Cause you only need the light when it's burning low\n" +
                "Only miss the sun when it starts to snow\n" +
                "Only know you love her when you let her go\n" +
                "Only know you've been high when you're feeling low\n" +
                "Only hate the road when you're missing home\n" +
                "Only know you love her when you let her go\n" +
                "And you let her go");

        FileWriter fw = new FileWriter("Let Her Go.txt");
        fw.write(song.getTitle() + "\n");
        fw.write(song.getSinger() + "\n");
        fw.write(song.getGenre() + "\n");
        fw.write(song.getLyrics());

        fw.close();
    }
}
