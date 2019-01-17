import java.util.*;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static Player p1Name;
    private static Player p2Name;

    public static void main(String[] args) {
        Scanner kbIn = new Scanner(System.in);

        System.out.print("What is player 1 (X) name: ");
        p1Name = new Player(kbIn.nextLine());

        System.out.println();

        System.out.print("What is player 2 (O) name: ");
        p2Name = new Player(kbIn.nextLine());

        initBoard();

        int choice = 0;
        int turn = 1;
        while(choice != -1 && turn < 10) {
            printBoard();
            Player currentPlayer = p1Name;

            if(turn % 2 == 0) {
                currentPlayer = p2Name;
            }
            System.out.print(currentPlayer + " pick a box (or -1 to end): ");
            turn++;
            choice = kbIn.nextInt();
            if(choice != -1) {
                while ((choice > 9 || choice < 1) || (board[(choice - 1) / 3][(choice - 1) % 3] == 'O' ||
                        board[(choice - 1) / 3][(choice - 1) % 3] == 'X')) {
                    System.out.print(currentPlayer + " please pick a valid box: ");
                    choice = kbIn.nextInt();
                }
                updateBoard(choice, currentPlayer);
            }
            printBoard();
            System.out.println("Game is now over.");
        }
    }

    public static void initBoard() {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                board[r][c] = (char)((r*3) + (c+1) + 48);
            }
        }
    }

    public static void printBoard() {
        for(int r = 0; r < board.length; r++) {
            System.out.print(" ");
            for(int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c]);
                if((c == 0) || (c == 1)) {
                    System.out.print(" | ");
                }
            }
            if(r != board.length - 1) {
                System.out.println("\n---+---+---");
            }
        }
        System.out.println();
    }

    public static void updateBoard(int num, Player currPlayer) {
        if(currPlayer.equals(p1Name)) {
            board[(num - 1) / 3][(num - 1) % 3] = 'X';
        }
        else{
            board[(num - 1) / 3][(num - 1) % 3] = 'O';
        }
    }
}

class Player {
    String name;

    public Player(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return name;
    }
}