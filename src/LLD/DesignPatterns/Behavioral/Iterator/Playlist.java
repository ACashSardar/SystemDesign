package LLD.DesignPatterns.Behavioral.Iterator;

interface Playlist {
    SongIterator createNormalIterator();

    SongIterator createHotSong2025Iterator();

    SongIterator createGenreIterator(String genre);
}