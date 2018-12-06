package world;

import java.util.ArrayList;

public class WorldMap {
    private static WorldMap ourInstance = new WorldMap();
    public int currentRoom=0;
    private ArrayList<room> map = new ArrayList<>();
    public static WorldMap getInstance() {
        return ourInstance;
    }
    public void populateWorldMap(){
        map.add(new room("Tutorial Room",1,-1,-1,-1,"Tutorial Room\nFrom there you can go only North"));
        map.add(new room("Tutorial Room2",-1,0,-1,-1,"Tutorial Room"));
    }
    public room getCurrentRoom()
    {
        return map.get(currentRoom);
    }
    public void move(int roomIndex){
        currentRoom=roomIndex;
    }
    private WorldMap() {
    }
}
