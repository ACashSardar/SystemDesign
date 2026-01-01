package LLD.DesignPatterns.Behavioral.Iterator;

import java.util.List;

public class HotSong2025Iterator implements SongIterator {
    private List<Song> songs;
    private int index = 0;

    HotSong2025Iterator(SongPlaylist playlist) {
        this.songs = playlist.getSongs();
    }

    @Override
    public boolean hasNext() {
        while (index < songs.size()) {
            if (songs.get(index).isHot2025)
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
