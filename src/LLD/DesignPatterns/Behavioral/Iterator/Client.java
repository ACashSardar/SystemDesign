package LLD.DesignPatterns.Behavioral.Iterator;

public class Client {
    public static void main(String[] args) {

        SongPlaylist playlist = new SongPlaylist();

        playlist.addSong(new Song("Sky High", "POP", true));
        playlist.addSong(new Song("Rock Solid", "ROCK", false));
        playlist.addSong(new Song("Future Bass", "EDM", true));
        playlist.addSong(new Song("Silent Strings", "CLASSICAL", false));
        playlist.addSong(new Song("Pop Vibes", "POP", true));

        System.out.println("---- All Songs ----");
        SongIterator normal = playlist.createNormalIterator();
        while (normal.hasNext()) {
            System.out.println(normal.next());
        }

        System.out.println("\n---- Hot Songs 2025 ----");
        SongIterator hot = playlist.createHotSong2025Iterator();
        while (hot.hasNext()) {
            System.out.println(hot.next());
        }

        System.out.println("\n---- POP Songs ----");
        SongIterator pop = playlist.createGenreIterator("POP");
        while (pop.hasNext()) {
            System.out.println(pop.next());
        }
    }
}
