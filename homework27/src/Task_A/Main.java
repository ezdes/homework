package Task_A;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Song song = new Song();

        FileReader fr = new FileReader("In The End.txt");
        Scanner scan = new Scanner(fr);

        String title = scan.nextLine();
        String singer = scan.nextLine();
        String genre = scan.nextLine();
        String lyrics = "";

        song.setTitle(title);
        song.setSinger(singer);
        song.setGenre(genre);

        while (scan.hasNextLine()){
            lyrics += scan.nextLine() + "\n";
        }

        song.setLyrics(lyrics);
        fr.close();

        System.out.println(song.getTitle());
        System.out.println(song.getSinger());
        System.out.println(song.getGenre());
        System.out.println(song.getLyrics());
    }
}
