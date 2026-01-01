package LLD.DesignPatterns.Behavioral.Iterator;

import java.util.List;

public class GenreSongIterator implements SongIterator {
    private List<Song> songs;
    private String genre;
    private int index = 0;

    GenreSongIterator(SongPlaylist playlist, String genre) {
        this.songs = playlist.getSongs();
        this.genre = genre;
    }

    @Override
    public boolean hasNext() {
        while (index < songs.size()) {
            if (songs.get(index).genre.equalsIgnoreCase(genre))
                return true;
            index++;
        }
        return false;
    }

    @Override
    public Song next() {
        return songs.get(index++);
    }
}
