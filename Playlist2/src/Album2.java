import java.util.ArrayList;
import java.util.LinkedList;

public class Album2 {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album2(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {

        Song songToAdd = new Song(title, duration);
        Song song = findSong(title);

        if (song == null) {
            songs.add(songToAdd);

            return true;
        }
        return false;
    }

    private Song findSong(String title) {

        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);

            if (song.getTitle() == title) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist) {

        if (track > 0 && songs.get(track - 1) != null) {
            playlist.add(songs.get(track - 1));

            return true;
        }
        return false;
    }

}
