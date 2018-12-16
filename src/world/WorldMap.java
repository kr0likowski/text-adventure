package world;

import characters.enemy;

import java.util.ArrayList;

public class WorldMap {
    private static WorldMap ourInstance = new WorldMap();
    public int currentRoom=0;
    public int lastRoom=0;
    private ArrayList<room> map = new ArrayList<>();
    public static WorldMap getInstance() {
        return ourInstance;
    }
    public void populateWorldMap(){
        room tutorialRoom = new room("Tutorial Room",1,-1,-1,-1,"Tutorial Room\nFrom there you can go only North");
        tutorialRoom.addAction("Get Orb".toLowerCase(),new Integer(1));
        tutorialRoom.setEnemy(new enemy(100,5,"Troll",null));
        map.add(tutorialRoom);
        map.add(new room("Tutorial Room2",-1,0,2,-1,"Tutorial Room"));
        map.add(new room("North 2",-1,-1,-1,1,"East room"));
    }
    public room getCurrentRoom()
    {
        return map.get(currentRoom);
    }
    public void move(int roomIndex){
        lastRoom=currentRoom;
        currentRoom=roomIndex;
    }
    private WorldMap() {
    }
}
