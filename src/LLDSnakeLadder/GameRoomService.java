package LLDSnakeLadder;

import java.util.HashMap;
import java.util.Map;

public class GameRoomService {

    private Map<Integer, GameRoom> gameRooms;

    public GameRoomService(){
        this.gameRooms = new HashMap<>();
    }

    public void joinRoom(Integer roomCode, User user){
        //validation
        gameRooms.get(roomCode).joinRoom(user);
    }

    public GameRoom createRoom(User user){
        GameRoom gameRoom = new GameRoom(user);
        gameRooms.put(gameRoom.getRoomCode(), gameRoom);
        return gameRoom;
    }

    public GameRoom getGameRoom(Integer roomCode){
        //validation
        return gameRooms.get(roomCode);
    }

}
