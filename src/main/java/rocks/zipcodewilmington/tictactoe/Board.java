package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Boolean threeOInRow = false;
    Boolean threeXInRow = false;
    public Board(Character[][] matrix) {




                // To Check is O is the winner
                //Row 1
                if (matrix[0][0] == 'O' && matrix[0][1] == 'O' && matrix[0][2] == 'O') {
                    threeOInRow = true;
                    isInFavorOfO();
                    getWinner();
                    // Row 2
                } else if (matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'O') {
                    threeOInRow = true;
                    isInFavorOfO();
                    getWinner();
                    //Row 3
                } else if (matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O') {
                    threeOInRow = true;
                    isInFavorOfO();
                    getWinner();
                    //Column 1
                } else if (matrix[0][0] == 'O' && matrix[1][0] == 'O' && matrix[2][0] == 'O') {
                    threeOInRow = true;
                    isInFavorOfO();
                    getWinner();
                    //Column 2
                } else if (matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O') {
                    threeOInRow = true;
                    isInFavorOfO();
                    getWinner();
                    //Column 3
                } else if (matrix[0][2] == 'O' && matrix[1][2] == 'O' && matrix[2][2] == 'O') {
                    threeOInRow = true;
                    isInFavorOfO();
                    getWinner();
                    //Diagonal from top left to bottom right
                } else if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') {
                    threeOInRow = true;
                    isInFavorOfO();
                    getWinner();
                    //Diagonal from bottom left column to top right column
                } else if (matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O') {
                    threeOInRow = true;
                    isInFavorOfO();
                    getWinner();
                    //Row 1 'X'
                } else if (matrix[0][0] == 'X' && matrix[0][1] == 'X' && matrix[0][2] == 'X') {
                    threeXInRow = true;
                    isInFavorOfX();
                    getWinner();
                    //Row 2 'X'
                } else if (matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X') {
                    threeXInRow = true;
                    isInFavorOfX();
                    getWinner();
                    //Row 3 'X'
                } else if (matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X') {
                    threeXInRow = true;
                    isInFavorOfX();
                    getWinner();
                    //Column 1 'X'
                } else if (matrix[0][0] == 'X' && matrix[1][0] == 'X' && matrix[2][0] == 'X') {
                    threeXInRow = true;
                    isInFavorOfX();
                    getWinner();
                    //Column 2 'X'
                } else if (matrix[0][1] == 'X' && matrix[1][1] == 'X' && matrix[2][1] == 'X') {
                    threeXInRow = true;
                    isInFavorOfX();
                    getWinner();
                    //Column 3 'X'
                } else if (matrix[0][2] == 'X' && matrix[1][2] == 'X' && matrix[2][2] == 'X') {
                    threeXInRow = true;
                    isInFavorOfX();
                    getWinner();
                    //Diagonal 'X'
                } else if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X') {
                    threeXInRow = true;
                    isInFavorOfX();
                    getWinner();
                    //Diagonal 'X'
                } else if (matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X') {
                    threeXInRow = true;
                    isInFavorOfX();
                    getWinner();
                    //No one matches 3 in a row; No winner
                } else {
                    isTie();
                    getWinner();
                }
    }


    public Boolean isInFavorOfX() {
        if (threeXInRow){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isInFavorOfO() {
        if (threeOInRow){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isTie() {
        if (threeOInRow){
            return false;
        }
        else if (threeXInRow){
            return false;
        }
        return true;
    }

    public String getWinner() {
        if(isInFavorOfX()) {
            return "X";
        } else if (isInFavorOfO()) {
            return "O";
        }
        return "";
    }

}
