import java.util.Scanner;

public class Go {
    static String[][] goBoard = new String[9][9];

    static void printBoard(String[][] board) {
        System.out.print("  ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int r = 0; r < board.length; r++) {
            System.out.print(r + " ");
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == null) {
                    System.out.print("+ ");
                } else {
                    System.out.print(board[r][c] + " ");
                }
            }
            System.out.println();
        }
    }

    static void placePeice(int x, int y, boolean player) {
        if (player) {
            goBoard[x][y] = "B";
        } else {
            goBoard[x][y] = "W";
        }
    }

    static boolean legalMove(int x, int y) {
        if (goBoard[x][y] == null) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean player = true;
        boolean playing = true;
        
        printBoard(goBoard);

        while (playing) {
            System.out.println(player ? "Black's Turn" : "White's Turn");

            System.out.print("Input X Coordinate: ");
            int x = scn.nextInt();

            System.out.print("Input Y Coordinate: ");
            int y = scn.nextInt();

            if (x == 11 || y == 11) {
                scn.close();
                System.out.println("Thanks for playing!");
                
            }
            else if (legalMove(x, y)) {
                placePeice(x, y, player);
                player = !player;
                printBoard(goBoard);
            }
            else {
                System.out.println("Illegal move try again. ");
            }
        }
    }
    
}
