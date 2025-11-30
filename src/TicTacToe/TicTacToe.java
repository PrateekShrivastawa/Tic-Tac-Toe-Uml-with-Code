package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicTacToe {
    Deque<Player> queue;
    Board board;
    public TicTacToe(){
        initialize();
    }
    public void initialize() {
        // no of player that is playing.
        queue = new LinkedList<>();
        Player player1 = new Player("Prateek", new ZeroSymbolClass());
        Player player2 = new Player("Prateeksha", new CrossSymbolClass());
        queue.add(player1);
        queue.add(player2);
        board = new Board();
    }
    public String startGame(){
        boolean iswinnerfound = false;
        String winner = null;
        while (iswinnerfound!=true){
            Player playerturn = queue.removeFirst();
            if(!board.isspaceavailable()){
                winner="DRAW";
                break;
            }
            System.out.println("Enter your row and column "+playerturn.getName());
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(!isValidIndex(row, col)){
                System.out.println("Please Enter at Valid Position and Try Again");
                queue.addFirst(playerturn);
                continue;
            }
            board.setNumber(row,col,playerturn.getPlayerSymbol());
            if(board.isanyWinner(playerturn.getPlayerSymbol())){
                winner = playerturn.getName();
                iswinnerfound = true;
                continue;
            }
            queue.addLast(playerturn);
            board.printBoard();
        }
        return winner;
    }




    private boolean isValidIndex(int row, int col) {
        return board.playerboard[row][col]==null;
    }

}
