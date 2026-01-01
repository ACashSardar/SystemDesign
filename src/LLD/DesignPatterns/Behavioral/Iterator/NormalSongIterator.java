package LLD.DesignPatterns.Behavioral.Iterator;

import java.util.List;

public class NormalSongIterator implements SongIterator {
    private List<Song> songs;
    private int index = 0;

    NormalSongIterator(SongPlaylist playlist) {
        this.songs = playlist.getSongs();
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(index++);
    }
}
