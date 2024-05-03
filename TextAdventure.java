import java.util.Scanner;

// dont forget ;
public class TextAdventure {
    public static void main(String[] args) {
        TextAdventure textAdventure = new TextAdventure();

        // video says format is Game game; game= new Game(); game.playerSetUp();
        // System.out.println(" Welcome to Far from Home text adventure you can move by
        // typing north, east, west, and south");

        textAdventure.playerGear();
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "You woke up in a golden wheat field, you don't remember much except that you want to go home.All you have are the clothes on your back and a map. Enter the direction you want to go");
                System.out.println("\n");
                System.out.println("1:North 2:South 3:West 4:East");
        String userMoveInput = scanner.nextLine();
        System.out.println("you walked " + userMoveInput);

    }

    public void playerGear() {
        int healthPoints = 10;
        String myObject1 = "normal hoodie";
        String myObject2 = "feeble stick";
        // right now will be invisible to user and events will trigger game over
        System.out.println("current items equipped  " + myObject1 + " and a " + myObject2);

    }
    public void northArea() {
        System.out.println("As you try to move past the field you see a");
        
    }
}