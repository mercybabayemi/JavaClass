import java.util.Arrays;

public class Tictactoe {
    private String player1Name;
    private String player2Name;
    private int boardCapacity = 3;
    private String[][] board = new String[boardCapacity][boardCapacity];
    private String markBoard = "";
    private boolean isPlayer = false;
    private Players currentPlayer = Players.PLAYER1;
    private char player1Marker = 'X';
    private char player2Marker = 'O';

    public Tictactoe(String name1, String name2) {
        this.player1Name = name1;
        this.player2Name = name2;
        for (int i = 0; i < boardCapacity; i++) {
            Arrays.fill(board[i], " ");
        }
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public boolean getIsPlayer() {
        return isPlayer;
    }

    public Players getCurrentPlayer() {
        return currentPlayer;
    }

    public void setIsPlayer() {
        if (!getIsPlayer()) {
            isPlayer = true;
            changePlayers();
        } else {
            isPlayer = false;
            changePlayers();
        }
    }

    public void changePlayers() {
        if (currentPlayer == Players.PLAYER1) {
            currentPlayer = Players.PLAYER2;
        } else {
            currentPlayer = Players.PLAYER1;
        }
    }

    public void collectUserPreferredSymbol(char marker) {
        if (currentPlayer == Players.PLAYER1) {
            setPlayer1Marker(marker);
        } else if (currentPlayer == Players.PLAYER2) {
            setPlayer2Marker(marker);
        }
    }

    public void setPlayer1Marker(char marker) {
        this.player1Marker = marker;
    }

    public void setPlayer2Marker(char marker) {
        this.player2Marker = marker;
    }

    public char getPlayer1Marker() {
        return player1Marker;
    }

    public char getPlayer2Marker() {
        return player2Marker;
    }

    public void setBoard(int row, int column) {
        if (!(0 <= row && row < boardCapacity && 0 <= column && column < boardCapacity)) {
            throw new IllegalArgumentException("Row and column must be within the bounds of the board.");
        }

        char value = currentPlayer == Players.PLAYER1 ? player1Marker : player2Marker;

        if (board[row][column].equals(" ")) {
            board[row][column] = String.valueOf(value);
        } else {
            throw new IllegalArgumentException("Cell at (" + row + ", " + column + ") is already occupied.");
        }

        setMarkBoard();
    }

    public void setMarkBoard() {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < boardCapacity; i++) {
            for (int j = 0; j < boardCapacity; j++) {
                newString.append(" ").append(board[i][j]).append(" ");
                if (j < boardCapacity - 1) newString.append("|");
            }
            newString.append("\n");
            if (i < boardCapacity - 1) newString.append("-----------\n");
        }
        markBoard = newString.toString();
    }

    public String getMarkBoard() {
        return markBoard;
    }

    public String[][] getBoard() {
        return board;
    }

    public boolean checkWinCondition() {
        System.out.println("Checking win condition...");
        setMarkBoard();
        int[][] winConditions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}
        };

        for (int[] condition : winConditions) {
            if (board[condition[0] / 3][condition[0] % 3].equals(String.valueOf(player1Marker)) &&
                    board[condition[1] / 3][condition[1] % 3].equals(String.valueOf(player1Marker)) &&
                    board[condition[2] / 3][condition[2] % 3].equals(String.valueOf(player1Marker))) {
                System.out.println(player1Name + " is the winner!");
                return true;
            } else if (board[condition[0] / 3][condition[0] % 3].equals(String.valueOf(player2Marker)) &&
                    board[condition[1] / 3][condition[1] % 3].equals(String.valueOf(player2Marker)) &&
                    board[condition[2] / 3][condition[2] % 3].equals(String.valueOf(player2Marker))) {
                System.out.println(player2Name + " is the winner!");
                return true;
            }
        }

        boolean isTie = true;
        for (String[] cell : board) {
            if (cell == null) {
                isTie = false;
                break;
            }
        }

        if (isTie) {
            System.out.println("It's a tie!");
            return false;
        }

        return false;
    }

    public void makeMove(int row, int col) {
        if (board[row][col].equals(" ")) {
            setBoard(row, col);
            if (!checkWinCondition()) {
                setIsPlayer();
            }
        } else {
            System.out.println("Invalid move! The cell is already taken.");
        }
    }

}
