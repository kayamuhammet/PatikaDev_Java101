import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    private int rows;
    private int cols;
    private int[][] board;
    private boolean[][] revealed;
    private boolean[][] mines;
    private int numMines;
    private boolean gameOver;
    private int remainingCells;

    public MineSweeper(int rows, int cols, int numMines) {
        this.rows = rows;
        this.cols = cols;
        this.numMines = numMines;
        this.board = new int[rows][cols];
        this.revealed = new boolean[rows][cols];
        this.mines = new boolean[rows][cols];
        this.gameOver = false;
        this.remainingCells = rows * cols - numMines;
        placeMines();
        calculateNumbers();
    }

    private void placeMines() {
        Random rand = new Random();
        int count = 0;
        while (count < numMines) {
            int row = rand.nextInt(rows);
            int col = rand.nextInt(cols);
            if (!mines[row][col]) {
                mines[row][col] = true;
                count++;
            }
        }
    }

    private void calculateNumbers() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mines[i][j]) {
                    continue;
                }
                int count = 0;
                for (int k = Math.max(0, i - 1); k <= Math.min(rows - 1, i + 1); k++) {
                    for (int l = Math.max(0, j - 1); l <= Math.min(cols - 1, j + 1); l++) {
                        if (mines[k][l]) {
                            count++;
                        }
                    }
                }
                board[i][j] = count;
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            printBoard();
            System.out.print("Enter row and column (e.g. 1 2): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            if (row < 0 || row >= rows || col < 0 || col >= cols) {
                System.out.println("Invalid row or column!");
                continue;
            }
            if (revealed[row][col]) {
                System.out.println("This cell is already revealed!");
                continue;
            }
            if (mines[row][col]) {
                gameOver = true;
                System.out.println("Game over! You stepped on a mine!");
            } else {
                revealCell(row, col);
                if (remainingCells == 0) {
                    gameOver = true;
                    System.out.println("Congratulations! You won the game!");
                }
            }
        }
    }

    private void revealCell(int row, int col) {
        revealed[row][col] = true;
        remainingCells--;
        if (board[row][col] == 0) {
            for (int i = Math.max(0, row - 1); i <= Math.min(rows - 1, row + 1); i++) {
                for (int j = Math.max(0, col - 1); j <= Math.min(cols - 1, col + 1); j++) {
                    if (!revealed[i][j]) {
                        revealCell(i, j);
                    }
                }
            }
        }
    }

    private void printBoard() {
        System.out.println();
        System.out.print("  ");
        for (int j = 0; j < cols; j++) {
            System.out.print((j + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < cols; j++) {
                if (revealed[i][j]) {
                    if (mines[i][j]) {
                        System.out.print("* ");
                    } else {
                        System.out.print(board[i][j] + " ");
                    }
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int numMines = (rows * cols) / 4;
        MineSweeper game = new MineSweeper(rows, cols, numMines);
        game.play();
    }
}


