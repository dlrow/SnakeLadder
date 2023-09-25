package LLDSnakeLadder.board;

import LLDSnakeLadder.game.Cell;
import LLDSnakeLadder.specialmove.Ladder;
import LLDSnakeLadder.specialmove.Snake;
import LLDSnakeLadder.specialmove.SpecialMove;

import java.util.concurrent.ThreadLocalRandom;

public class SquareBoard implements Board {

    Cell[][] cells;
    Cell endOfBoard;

    public SquareBoard(){
    }

    public SquareBoard(int boardSize, int numberOfSnakes, int numberOfLadders){
        initializeCells(boardSize);
        addSnakesLadders(cells, numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];
        Cell cellObj = null;
        for(int i=0;i<boardSize;i++) {
            for(int j=0; j<boardSize;j++) {
                cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
        endOfBoard = cellObj;
    }

    private void addSnakesLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders){

        while (numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, snakeHead);

            Cell head = getCell(snakeHead);
            Cell tail = getCell(snakeTail);
            SpecialMove snakeObj = new Snake(head, tail);
            head.setSpecialMove(snakeObj);

            numberOfSnakes--;
        }

        while(numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(ladderStart,cells.length*cells.length-1);

            Cell ladderStartCell = getCell(ladderStart);
            Cell ladderEndCell = getCell(ladderEnd);

            SpecialMove ladderObj = new Ladder(ladderStartCell, ladderEndCell);
            ladderStartCell.setSpecialMove(ladderObj);

            numberOfLadders--;
        }

    }

    @Override
    public Cell getCell(int value) {
        int boardRow = value / cells.length;
        int boardColumn = (value % cells.length);
        return cells[boardRow][boardColumn];
    }

    @Override
    public boolean isWinningCell(Cell cell){
        return this.endOfBoard==cell;
    }
}
