package LLD.Applications.TicTacToe;

public class Player {
    String name;
    PlayingPiece playingPiece;
    PlayingStrategy playingStrategy;

    public Player(String name, PlayingPiece playingPiece, PlayingStrategy playingStrategy) {
        this.name = name;
        this.playingPiece = playingPiece;
        this.playingStrategy = playingStrategy;
    }

    public void makeMove(Board board) {
        playingStrategy.makeMove(playingPiece, board);
    }
}
