package LLDSnakeLadder.specialmove;

import LLDSnakeLadder.game.Cell;
import LLDSnakeLadder.game.Player;

public class Snake implements SpecialMove {

    Cell head;
    Cell tail;

    public Snake(Cell head, Cell tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public void execute(Player player){

    }

    public Cell getHead() {
        return head;
    }

    public Cell getTail() {
        return tail;
    }

    public void setHead(Cell head) {
        this.head = head;
    }

    public void setTail(Cell tail) {
        this.tail = tail;
    }
}
