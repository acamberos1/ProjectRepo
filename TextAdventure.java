import java.util.Scanner;

// dont forget ;
public class TextAdventure {
    Scanner scanner = new Scanner(System.in);
    
    // Scanner inputScan = new Scanner(System.in); incase i want console to wait

    public static void main(String[] args) {
        TextAdventure textAdventure = new TextAdventure();
        PlayerEquipment peObj = new PlayerEquipment();

        // video says format is Game game; game= new Game(); game.playerSetUp();
        // System.out.println(" Welcome to Far from Home text adventure you can move by
        // typing north, east, west, and south");
        peObj.playerGear();
       
        System.out.println(
                "You woke up in a golden wheat field, you don't remember much except that you want to go home.All you have are the clothes on your back and a map. Enter the number of the direction you want to go");
                System.out.println("\n");
                System.out.println("1:North ,2:South, 3:West, 4:East");
        //userMoveInput = scanner.nextint();
        textAdventure.crossRoad();

    }
    public void crossRoad() {
       int userMoveInput = scanner.nextInt();
       if (userMoveInput == 1) {
        northArea();
       }
       if (userMoveInput == 2) {
        southArea();
       }
       if (userMoveInput == 3) {
        westArea();
       }
       if (userMoveInput == 4) {
        eastArea();
       }

    }

   
    public static void northArea() {
        System.out.println("As you try to move past the field you notice a forest of pine trees lightly covered in a blanket of snow. A barely visible dirt road is seen between the trees. You see a human sized snowman. For a second you think you see him wave until you blink again.\n The snowman is gone and suddenly a sky blue door appears before you. ");
        
    }
    public void southArea() {
        System.out.println("You look back and see the landscape go from tall golden grass to bare dirt and slowly lead to the dunes. The dunes look endless and unhospitable. You see something glint in the distance. You need to explore more to get it but is it safe? \n");
    }
    public void westArea() {
        System.out.println("as you walk west you see the tall grass shorten and lead to wet green grass before appearing in patches as you progress. Trees soon appear in droves making the atmosphere seem murky as it gets a bit misty in the path ahead.\n");

        System.out.println("It gets darker and darker until you see an opening in the murky forest. You see a swamp with a small cottage with a porch supported by wooden beams.");
    }
    // add interaction to go forward , villian?
    public void eastArea(){
        System.out.println("heading east  you see the tall grass shorten until it becomes green as you march east. The grass then rises while appearing grass green. The trees you see ahead have vines loosely hanging on some branches.  \n ");
        // quicksand?
    }
}