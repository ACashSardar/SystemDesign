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
        int i = index;
        while (i < songs.size()) {
            if (songs.get(i).isHot2025)
                return true;
            i++;
        }
        return false;
    }

    @Override
    public Song next() {
        return songs.get(index++);
    }
}
