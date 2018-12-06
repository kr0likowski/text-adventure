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
        gameController.initGame();
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
