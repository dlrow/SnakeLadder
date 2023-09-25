package LLDSnakeLadder.board;

import LLDSnakeLadder.game.Cell;

public interface Board {

    Cell getCell(int playerPosition);

    boolean isWinningCell(Cell cell);
}
