package LLDSnakeLadder.GamePlayStrategy;

import LLDSnakeLadder.board.Board;
import LLDSnakeLadder.game.Dice;

public interface GamePlayStrategy {
    void playGame();

    void setDice(Dice dice);

    void setBoard(Board board);
}
