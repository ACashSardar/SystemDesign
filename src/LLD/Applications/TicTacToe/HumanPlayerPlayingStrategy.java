package LLD.Applications.TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanPlayerPlayingStrategy implements PlayingStrategy {
    @Override
    public void makeMove(PlayingPiece playingPiece, Board board) {
        while (!board.isBoardFull()) {
            System.out.println("Please select a position (x, y) to fill with " + playingPiece.pieceType);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String input = "";
            try {
                input = bufferedReader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String[] arr = input.split(",");
            int row = Integer.parseInt(arr[0]);
            int col = Integer.parseInt(arr[1]);
            if (board.board[row][col] != null) {
                System.out.println("Invalid Position!!");
                continue;
            }
            board.addPiece(row, col, playingPiece);
            break;
        }
    }
}
