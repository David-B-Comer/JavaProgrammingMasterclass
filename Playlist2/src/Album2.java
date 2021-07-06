import java.util.ArrayList;
import java.util.LinkedList;

public class Album2 {

    private String name;
    private String artist;
    private SongList songs;

    public Album2(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {

        Song songToAdd = new Song(title, duration);
        Song song = songs.findSong(title);

        if (song == null) {
            songs.add(songToAdd);

            return true;
        }
        return false;
    }


    public boolean addToPlayList(int track, LinkedList<Song> playlist) {

        Song song = songs.findSong(track);

        if (song != null) {
            playlist.add(song);

            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {

        Song song = songs.findSong(title);

        if (song != null) {
            playlist.add(song);

            return true;
        }
        return false;
    }


    public static class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {

            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;
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

        private Song findSong(int track) {

            if (track - 1 > 0 && track - 1 < songs.size()) {
                return songs.get(track - 1);
            }
            return null;
        }


        }

}
