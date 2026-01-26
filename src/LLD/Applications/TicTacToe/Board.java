package LLD.Applications.TicTacToe;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean isSpaceAvailable(int row, int col) {
        return board[row][col] == null;
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if (!isSpaceAvailable(row, col)) return false;
        board[row][col] = playingPiece;
        return true;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print((board[i][j] != null ? board[i][j].pieceType : "_") + " | ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");
    }
}
