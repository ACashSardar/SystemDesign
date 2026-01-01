package LLD.DesignPatterns.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class SongPlaylist implements Playlist {
    private List<Song> songs = new ArrayList<>();

    void addSong(Song song) {
        songs.add(song);
    }

    List<Song> getSongs() {
        return songs;
    }

    @Override
    public SongIterator createNormalIterator() {
        return new NormalSongIterator(this);
    }

    @Override
    public SongIterator createHotSong2025Iterator() {
        return new HotSong2025Iterator(this);
    }

    @Override
    public SongIterator createGenreIterator(String genre) {
        return new GenreSongIterator(this, genre);
    }

}
