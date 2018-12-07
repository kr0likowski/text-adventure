import characters.player;
import items.item;
import world.room;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String a;
        boolean action=true;
        Scanner input = new Scanner(System.in);
        Controller gameController = Controller.getInstance();
        System.out.println("You're playing text-adventure game by Kr0likowski\n" +
                "Rules:\n" +
                "You have to go to the end of labyrinth and collect all the orbs\n" +
                "Commands:\n" +
                "North, South, East, West to move\n" +
                "Action to make any action\n" +
                "Talk if there is any other character in the room \n" +
                "You can write hello to start");

        a=input.nextLine();
        while(!a.equals("Exit"))
        {
            if(action) {
                gameController.displayRoom();
            }
           a=input.nextLine();
           action=gameController.handleInput(a);
        }


    }

}
