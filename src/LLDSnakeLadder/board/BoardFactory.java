package LLDSnakeLadder.board;

public class BoardFactory {
    public static Board getBoard(String board){
        if(board.equalsIgnoreCase("rectangle")){
            return new RectangleBoard();
        }else{
            return new SquareBoard();
        }
    }
}
