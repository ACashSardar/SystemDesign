package LLD.Applications.TicTacToe;

import java.util.LinkedList;
import java.util.Queue;

public class TicTacToeGame {
    public Queue<Player> playerQueue;
    public Board playingBoard;

    public void initializeGame() {
        playerQueue = new LinkedList<>();
        playingBoard = new Board(3);

        PlayingPiece playingPieceX = new PlayingPieceX();
        Player player1 = new Player("Akash", playingPieceX, new HumanPlayerPlayingStrategy());

        PlayingPiece playingPieceO = new PlayingPieceO();
        Player player2 = new Player("Lipika", playingPieceO, new HumanPlayerPlayingStrategy());

        playerQueue.add(player1);
        playerQueue.add(player2);
    }

    public boolean hasCurrentPlayerWon(Player player) {
        int n = playingBoard.size;

        // Check row wise
        for (int i = 0; i < n; i++) {
            boolean ok = true;
            for (int j = 0; j < n; j++) {
                if (playingBoard.board[i][j] != player.playingPiece) ok = false;
            }
            if (ok) return true;
        }

        // Check column wise
        for (int i = 0; i < n; i++) {
            boolean ok = true;
            for (int j = 0; j < n; j++) {
                if (playingBoard.board[j][i] != player.playingPiece) ok = false;
            }
            if (ok) return true;
        }

        // Check diagonal wise
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (playingBoard.board[i][i] != player.playingPiece) ok = false;
        }
        if (ok) return true;

        // Check anti-diagonal wise
        ok = true;
        for (int i = 0; i < n; i++) {
            if (playingBoard.board[i][n - 1 - i] != player.playingPiece) ok = false;
        }
        if (ok) return true;

        return false;
    }

    public String startGame() {
        System.out.println("STARTING THE GAME...");

        while (!playingBoard.isBoardFull()) {
            Player currPlayer = playerQueue.poll();
            System.out.println(currPlayer.name + "'s Turn");
            playingBoard.printBoard();
            currPlayer.makeMove(playingBoard);
            if (hasCurrentPlayerWon(currPlayer)) {
                return currPlayer.name;
            }
            playerQueue.add(currPlayer);
        }

        return "TIE";
    }
}
