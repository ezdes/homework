package Task_B;

public class Song {

    private String title;
    private String singer;
    private String genre;
    private String lyrics;

    public Song(){

    }

    public Song(String title, String singer, String genre, String lyrics){
        this.title = title;
        this.singer = singer;
        this.genre = genre;
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
