package LLDSnakeLadder.specialmove;

import LLDSnakeLadder.game.Cell;
import LLDSnakeLadder.game.Player;

public class Ladder implements SpecialMove{
    Cell start;
    Cell end;

    @Override
    public void execute(Player player) {
    }

    public Ladder(Cell start, Cell end) {
        this.start = start;
        this.end = end;
    }

    public Cell getStart() {
        return start;
    }

    public Cell getEnd() {
        return end;
    }

    public void setStart(Cell start) {
        this.start = start;
    }

    public void setEnd(Cell end) {
        this.end = end;
    }
}
