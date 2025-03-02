public class SevenSegmentDisplay {
    private boolean isOn;
    private final int boardCapacity = 4;
    private char[][] board;

    public SevenSegmentDisplay() {
        this.isOn = false;
        this.board = new char[boardCapacity + 1][boardCapacity];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public boolean getIsOn() {
        return isOn;
    }

    public char[][] getBoard() {
        return board;
    }

    public char[][] displaySegment(String digits) {
        validate(digits);
        boolean value = changeStatus(digits);
        if (value) {
            setBoard(digits);
        }
        return getBoard();
    }

    private boolean changeStatus(String digits) {
        if (digits.charAt(7) == '1') {
            isOn = true;
            return getIsOn();
        } else {
            isOn = false;
            return getIsOn();
        }
    }

    private void setBoard(String digits) {
        if (digits.charAt(0) == '1') {
            for (int i = 0; i < 4; i++) {
                board[0][i] = '#';
            }
        }

        if (digits.charAt(1) == '1' && digits.charAt(2) == '1') {
            board[1][3] = '#';
            board[2][3] = '#';
            board[3][3] = '#';
        } else if (digits.charAt(1) == '1') {
            board[1][3] = '#';
            board[2][3] = '#';
        } else if (digits.charAt(2) == '1') {
            board[2][3] = '#';
            board[3][3] = '#';
        }

        if (digits.charAt(3) == '1') {
            board[4][0] = '#';
            board[4][1] = '#';
            board[4][2] = '#';
            board[4][3] = '#';
        }

        if (digits.charAt(4) == '1' && digits.charAt(5) == '1') {
            board[1][0] = '#';
            board[2][0] = '#';
            board[3][0] = '#';
        } else if (digits.charAt(1) == '1') {
            board[1][0] = '#';
            board[2][0] = '#';
        } else if (digits.charAt(2) == '1') {
            board[2][0] = '#';
            board[3][0] = '#';
        }

        if (digits.charAt(6) == '1') {
            for (int i = 0; i < 4; i++) {
                board[2][i] = '#';
            }
        }
    }

    private void validate(String digits) {
        if (!digits.matches("[01]+")) {
            throw new IllegalArgumentException("Binary number must consist of only 0s and 1s");
        }
        if (digits.length() != 8) {
            throw new IllegalArgumentException("Binary number must be 8 digits long");
        }
    }

}
