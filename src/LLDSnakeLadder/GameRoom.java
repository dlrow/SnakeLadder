package LLDSnakeLadder;

import LLDSnakeLadder.GamePlayStrategy.GamePlayStrategy;
import LLDSnakeLadder.GamePlayStrategy.OneWinnerGamePlayStrategy;
import LLDSnakeLadder.board.Board;
import LLDSnakeLadder.board.BoardFactory;
import LLDSnakeLadder.board.SquareBoard;
import LLDSnakeLadder.game.Game;
import LLDSnakeLadder.game.SnakeLadderGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GameRoom {
    private Integer roomCode;
    private List<User> users;
    private User createdBy;
    private Game game;

    public GameRoom(User createdBy){
        this.createdBy = createdBy;
        users = new ArrayList<>();
        users.add(createdBy);
        roomCode = new Random().nextInt();
    }

    public void createGame(){
        //initialize Game
        Board board = new SquareBoard(10, 5, 8);
        GamePlayStrategy gamePlayStrategy = new OneWinnerGamePlayStrategy(users);
        this.game = new SnakeLadderGame(board, 2, gamePlayStrategy);
    }

    public void joinRoom(User user){
        users.add(user);
    }

    public int getRoomCode() {
        return roomCode;
    }

    public List<User> getUsers() {
        return users;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game){
        //initialize Game
        this.game = game;
    }

    public void startGame(){
        //start Game
        game.startGame();
    }
}
