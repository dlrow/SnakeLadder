package LLDSnakeLadder.game;

import LLDSnakeLadder.game.Cell;

public class Player {

    int id;
    Cell currentPosition;

    public Player(int id, Cell currentPosition) {
        this.id = id;
        this.currentPosition = currentPosition;
    }

    public int getId() {
        return id;
    }

    public Cell getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Cell currentPosition) {
        this.currentPosition = currentPosition;
    }
}
