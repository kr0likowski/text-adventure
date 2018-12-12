import characters.player;
import items.item;
import world.WorldMap;
import world.room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Controller {
    private static Controller ourInstance = new Controller();
    WorldMap worldMap;
    Random gen = new Random();

    public static Controller getInstance() {
        return ourInstance;
    }
    public void initGame(){
        worldMap=WorldMap.getInstance();
        worldMap.populateWorldMap();
    }
    ArrayList<item> inventory = new ArrayList<>();
    private player Player = new player(100, 50, "name", inventory);
    public boolean playerStatus(){
        System.out.println(Player.getHp()+" hp\n"+Player.getBaseDmg()+" base dmg");
        for(item i : Player.getInventory()){
            i.itemInfo();
        }
        return false;
    }
    public boolean isEnemy(){
        return worldMap.getCurrentRoom().getRoomEnemy()!=null && worldMap.getCurrentRoom().getRoomEnemy().getHp()>=0;
    }
    public boolean movePlayer(int direction){
        switch(direction){
            case 1:
                if(worldMap.getCurrentRoom().getN()!=-1)
                {
                    worldMap.move(worldMap.getCurrentRoom().getN());
                    return true;
                }else
                    {
                        System.out.println("There is no exit there");
                        return false;
                    }

            case 2:
                if(worldMap.getCurrentRoom().getE()!=-1)
                {
                    worldMap.move(worldMap.getCurrentRoom().getE());
                    return true;
                }else
                {
                    System.out.println("There is no exit there");
                    return false;
                }

            case 3:
                if(worldMap.getCurrentRoom().getS()!=-1)
                {
                    worldMap.move(worldMap.getCurrentRoom().getS());
                    return true;
                }else
                {
                    System.out.println("There is no exit there");
                    return false;
                }
            case 4:
                if(worldMap.getCurrentRoom().getW()!=-1)
                {
                    worldMap.move(worldMap.getCurrentRoom().getW());
                    return true;
                }else
                {
                    System.out.println("There is no exit there");
                    return false;
                }
        }
        return false;
    }
    public boolean handleInput(String command){
        switch(command)
        {
            case "north":
                return movePlayer(1);
            case "east":
               return movePlayer(2);
            case "south":
                return movePlayer(3);
            case "west":
               return movePlayer(4);
            case "action":
                for(String s: worldMap.getCurrentRoom().getActions().keySet())
                {
                    System.out.println(s);
                }
                return false;
            case "exit":
                return false;
            case "status":
                return playerStatus();
            default:
                return worldMap.getCurrentRoom().makeAction(command.toLowerCase(),Player);
        }

    }
    public boolean handleFight(String command){
        switch(command){
            case "attack":
                System.out.println("You attack for "+ Player.getBaseDmg() +" dmg");
                worldMap.getCurrentRoom().getRoomEnemy().decreaseHP(Player.getBaseDmg());
                if(worldMap.getCurrentRoom().getRoomEnemy().getHp()<=0){
                    worldMap.getCurrentRoom().enemyDefeated();
                }else {
                    System.out.println("Enemy's turn");
                    System.out.println("Enemy attack for " + worldMap.getCurrentRoom().getRoomEnemy().getBaseDmg());
                    Player.decreaseHP(worldMap.getCurrentRoom().getRoomEnemy().getBaseDmg());
                }
                return true;
            case "run":
                int a=gen.nextInt(10);
                if(a>6)
                {
                   worldMap.move(worldMap.lastRoom);
                }else{
                    System.out.println("You failed to run");
                    System.out.println("Enemy's turn");
                    System.out.println("Enemy attack for " + worldMap.getCurrentRoom().getRoomEnemy().getBaseDmg());
                    Player.decreaseHP(worldMap.getCurrentRoom().getRoomEnemy().getBaseDmg());
                }
                return true;

        }
        return false;
    }
    public void displayRoom(){
        room currentRoom = worldMap.getCurrentRoom();
        System.out.println(currentRoom.getDescription());
    }
    public boolean playerAlive(){
        return Player.getHp()>=0;
    }
    private Controller() {
    }
}
