package LLDSnakeLadder.GamePlayStrategy;

import LLDSnakeLadder.User;
import LLDSnakeLadder.board.Board;
import LLDSnakeLadder.game.Cell;
import LLDSnakeLadder.game.Dice;
import LLDSnakeLadder.game.Player;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class OneWinnerGamePlayStrategy implements GamePlayStrategy {

    Board board;
    Dice dice;
    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public OneWinnerGamePlayStrategy(List<User> users) {
        createPlayersFromUsers(users);
    }

    private void createPlayersFromUsers(List<User> users) {
        int i = 0;
        for(User user : users){
            Player player = new Player(i++, board.getCell(0));
            playersList.add(player);
        }
    }

    @Override
    public void playGame() {
        while(winner == null) {
            //check whose turn now
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is:" + playerTurn.getId() + " current position is: " + playerTurn.getCurrentPosition().getValue());

            //roll the dice
            int diceNumbers = dice.rollDice();

            //get the new position
            int playerNewPositionValue = playerTurn.getCurrentPosition().getValue() + diceNumbers;
            Cell playerNewPosition = board.getCell(playerNewPositionValue);
            if(playerNewPosition.hasSpecialMove()){
                playerNewPosition.getSpecialMove().execute(playerTurn);
            }
            System.out.println("player turn is:" + playerTurn.getId() + " new Position is: " + playerNewPosition);
            //check for winning condition
            if(board.isWinningCell(playerNewPosition))
                winner = playerTurn;
        }
    }

    @Override
    public void setDice(Dice dice) {
        this.dice = dice;
    }

    @Override
    public void setBoard(Board board) {
        this.board = board;
    }

    private Player findPlayerTurn() {
        Player playerTurns = playersList.removeFirst();
        playersList.addLast(playerTurns);
        return playerTurns;
    }
}
