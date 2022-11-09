package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    boolean result = false;
    private Character [][] board;
    public Board(Character[][] matrix) { board = matrix; }
    public boolean isWinHorizontal(char letter){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[i][j] != letter){
                    break;
                }
                else if (i == board.length - 1){
                    return result = true;
                }
            }
        }
        return false;
    }

    public boolean isWinVertical(char letter){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[i][j] != letter){
                    break;
                }
                else if (j == board.length - 1){
                    return result = true;
                }
            }
        }
        return false;
    }

    public boolean isWinDiagonal(char letter){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (i == j && i == letter && j == letter){
                    return result = true;
                }
            }
        }
        return false;
    }

    public boolean isWinOppositeDiagonal(char letter){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if ((i + j == board.length - 1) && i == letter && j == letter){
                    return result = true;
                }
            }
        }
        return false;
    }

    public Boolean isInFavorOfX() {
        char letter = 'X';
        if ((isWinHorizontal(letter) || isWinVertical(letter) || isWinDiagonal(letter) || isWinOppositeDiagonal(letter))){
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        char letter = 'O';
        if ((isWinHorizontal(letter) || isWinVertical(letter) || isWinDiagonal(letter) || isWinOppositeDiagonal(letter))){
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if (!isInFavorOfO() && !isInFavorOfX()){
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfO()){
            return "O";
        }
        else if (isInFavorOfX()){
            return "X";
        } else
        return "";
    }

}
