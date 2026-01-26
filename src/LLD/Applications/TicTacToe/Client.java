package LLD.Applications.TicTacToe;

public class Client {
    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.initializeGame();
        String res = ticTacToeGame.startGame();
        if (res.equals("TIE")) {
            System.out.println("Game Draw");
        } else {
            System.out.println(res + " has won the game.");
        }
    }
}
