package LLDSnakeLadder.game;

import LLDSnakeLadder.specialmove.SpecialMove;

public class Cell {

    int value;
    SpecialMove specialMove;

    public int getValue() {
        return value;
    }

    public boolean hasSpecialMove() {
        return !(this.specialMove == null);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SpecialMove getSpecialMove() {
        return specialMove;
    }

    public void setSpecialMove(SpecialMove specialMove) {
        this.specialMove = specialMove;
    }
}
