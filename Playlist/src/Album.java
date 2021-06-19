import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {

        if (findSong(title) == null) {
            songs.add(new Song(title, duration));

            return true;
        }
        return false;
    }

    public Song findSong(String title) {

        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);

            if (song.getTitle() == title) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int track, LinkedList<Song> playlist) {

        if (track <= 0) {
            return false;
        }
        Song song = songs.get(track - 1);
        playlist.add(song);

        return true;
    }

}
