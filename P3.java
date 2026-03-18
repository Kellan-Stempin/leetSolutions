import java.util.Scanner;

public class P3 {
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

    static void placePiece(int x, int y, boolean player) {
        if (player) {
            goBoard[x][y] = "B";
        } else {
            goBoard[x][y] = "W";
        }
    }

    static boolean legalMove(int x, int y) {
        if (goBoard[x][y] != null) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}