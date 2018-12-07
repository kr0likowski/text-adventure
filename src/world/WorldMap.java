package world;

import java.util.ArrayList;

public class WorldMap {
    private static WorldMap ourInstance = new WorldMap();
    public int currentRoom=0;
    private ArrayList<room> map = new ArrayList<>();
    private Void action(){
        System.out.println("Got orb");
        return null;
    }
    public static WorldMap getInstance() {
        return ourInstance;
    }
    public void populateWorldMap(){
        room tutorialRoom = new room("Tutorial Room",1,-1,-1,-1,"Tutorial Room\nFrom there you can go only North");
        tutorialRoom.addAction("Get Orb",action());
        map.add(tutorialRoom);
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
