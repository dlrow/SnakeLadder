package LLDSnakeLadder.game;

import LLDSnakeLadder.GamePlayStrategy.GamePlayStrategy;
import LLDSnakeLadder.board.Board;

public class SnakeLadderGame implements Game{

    Board board;
    Dice dice;
    GamePlayStrategy gamePlayStrategy;

    public SnakeLadderGame(Board board, int diceCount, GamePlayStrategy gamePlayStrategy){
        this.board = board;
        dice = new Dice(diceCount);
        gamePlayStrategy.setBoard(board);
        gamePlayStrategy.setDice(dice);
        this.gamePlayStrategy = gamePlayStrategy;

    }

    public void startGame(){
        gamePlayStrategy.playGame();
    }
}
