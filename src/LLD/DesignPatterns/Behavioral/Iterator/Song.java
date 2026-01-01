package LLD.DesignPatterns.Behavioral.Iterator;

class Song {
    String name;
    String genre;
    boolean isHot2025;

    Song(String name, String genre, boolean isHot2025) {
        this.name = name;
        this.genre = genre;
        this.isHot2025 = isHot2025;
    }

    @Override
    public String toString() {
        return name + " (" + genre + ")";
    }
}
