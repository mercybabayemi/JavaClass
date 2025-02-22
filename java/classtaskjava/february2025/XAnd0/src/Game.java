public class Game {
    private final char[][] board ;
    private final int[][] binaryBoard;
    int boardCapacity = 3;
    private boolean isPlayer;
    private Players players;
    private char player1Marker = 'x';
    private char player2Marker = 'o';

    public Game(){
        this.binaryBoard = new int[boardCapacity][boardCapacity];
        this.board = new char[boardCapacity][boardCapacity];
        this.isPlayer = false;
        this.players = Players.PLAYER1;
    }

    public void setBoard(int row, int column) {
        if(!(0 <= row && row < boardCapacity && 0 <= column && column < boardCapacity)) throw new IndexOutOfBoundsException("Row and column must be within the bounds of the board.");

        char value = 0;
        if(getPlayer() == Players.PLAYER1)value = getPlayer1Marker();
        else if(getPlayer() == Players.PLAYER2) value = getPlayer2Marker();

        if(board[row][column] == '\u0000') board[row][column] = value;
        else throw new IllegalArgumentException(String.format("Cell at (%d,%d) is  already occupied", row, column));
    }

    public char[][] getCharacterBoard() {
        return this.board;
    }

    public int[][] getBinaryBoard(){
        replaceBoardWithBinary();
        return this.binaryBoard;
    }

    private void replaceBoardWithBinary() {
        for(int row = 0; row < this.board.length; row++){
            for(int column = 0; column < this.board[row].length; column++){
                if(this.board[row][column] == getPlayer1Marker()){
                    this.binaryBoard[row][column] = 1;
                }else if(this.board[row][column] == getPlayer2Marker()){
                    this.binaryBoard[row][column] = 0;
                }
            }
        }
    }

    public boolean getIsPlayers() {
        return this.isPlayer;
    }

    public Players getPlayer(){
        return this.players;
    }

    public void setIsPlayers() {
            if(!getIsPlayers()){
                this.isPlayer = true;
                changePlayers();
            }else{
                this.isPlayer = false;
                changePlayers();
            }
    }

    private void changePlayers() {
        if(getPlayer() == Players.PLAYER1){
            this.players = Players.PLAYER2;
        }else{
            this.players = Players.PLAYER1;
        }
    }

    public void collectUserPreferredSymbol(char marker) {
        if(getPlayer() == Players.PLAYER1) setPlayer1Marker(marker);
        else if(getPlayer() == Players.PLAYER2) setPlayer2Marker(marker);
    }

    private void setPlayer2Marker(char marker) {
        this.player2Marker = marker;
    }

    private void setPlayer1Marker(char marker) {
        this.player1Marker = marker;
    }

    public char getPlayer1Marker() {
        return this.player1Marker;
    }

    public char getPlayer2Marker() {
        return this.player2Marker;
    }
}
