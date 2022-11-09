package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    boolean result = false;
    private Character [][] board;
    public Board(Character[][] matrix) { board = matrix; }
    public boolean isWinVertical(char letter){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j <= 0; j++){
                if (board[j][i].equals(letter) && board[j+1][i].equals(letter) && board[j+2][i].equals(letter)){
                    result = true;
            }
        }
    }
        return result;
}

    public boolean isWinHorizontal(char letter){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j <= 0; j++){
                if (board[i][j].equals(letter) && board[i][j+1].equals(letter) && board[i][j+2].equals(letter)) {
                    result = true;
            }
        }
    }
        return result;
}
    public boolean isWinDiagonal(char letter){
        if (board[0][0].equals(letter) && board[1][1].equals(letter) && board[2][2].equals(letter)){
            result = true;
        }
        return result;
    }

    public boolean isWinOppositeDiagonal(char letter){
        if (board[0][2].equals(letter) && board[1][1].equals(letter) && board[2][0].equals(letter)){
            result = true;
                }
        return result;
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
