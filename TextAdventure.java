import java.util.Scanner;

// dont forget ;
public class TextAdventure {
    Scanner scanner = new Scanner(System.in);
    Scanner choiceScanner = new Scanner(System.in);
    // two scanners to take user input
    int userChoice;
    int userMoveInput;
    // declaring the name of the scanners
    PlayerMap pMap = new PlayerMap();
    // declaring object of map to call map in methods
    TextAdventure textAdventure;
    PlayerEquipment peObj = new PlayerEquipment();
    // same as map 

  

    public static void main(String[] args) {
        TextAdventure textAdventure = new TextAdventure();

        PlayerEquipment peObj = new PlayerEquipment();
        peObj.playerGear();

        System.out.println(
                "You woke up in a golden wheat field, you don't remember much except that you want to go home.All you have are the clothes on your back and a map. Enter the number of the direction you want to go \n");
        
    textAdventure.crossRoad();

    }

    public void crossRoad() {
        System.out.println("1:North ,2:South, 3:West, 4:East");

         userMoveInput = scanner.nextInt();
        if (userMoveInput == 1) {
            northArea();
        }
       else if (userMoveInput == 2) {
            southArea();
        }
       else if (userMoveInput == 3) {
            westArea();
        }
       else if (userMoveInput == 4) {
            eastArea();
        }
        else {
            System.out.println("that was the wrong input put, numbers only");
            crossRoad();
        }

    }

    public void northArea() {
        PlayerEquipment peObj = new PlayerEquipment();
        peObj.playerGear();
        pMap.northBiomeEntry();
        System.out.println(
                "As you try to move past the field you notice a forest of pine trees lightly covered in a blanket of snow. A barely visible dirt road is seen between the trees. You see a human sized snowman. For a second you think you see him wave until you blink again.\n The snowman is gone and suddenly a sky blue door appears before you. Initially as you move to open it on instinct you feel an ominous feeling beyond the door. Do you open it? 1: Yes, 2: No");
            userChoice = scanner.nextInt();
        if (userChoice == 1) {
            System.out.println(" as you open the door and step through you hear the door slam and suddenly become bombarded by a severe snow storm \n as you withstand the cold with your " + peObj.getMyObject1() + "as you see lights from a cabin a spark in you refills your hope and spurs you on to sprint to your lost home \n the end ");
        }
        if (userChoice == 2) {
            System.out.println("you don't feel ready and head back " );
            textAdventure.crossRoad();
        }

    }

    public void southArea() {
        pMap.southBiome();
        System.out.println(
                "You look back and see the landscape go from tall golden grass to bare dirt and slowly lead to the dunes. As you walk closer the dunes look endless and unhospitable. You see something glint in the distance. You need to explore more to get it but is it safe? \n Do you explore further? 1:Yes , 2:No");
        if (userMoveInput == 2) {
            textAdventure.crossRoad();
        }
       else if (userMoveInput == 1) {
            southBack();
             } else {
                crossRoad();
             }
    }

    public void southBack() {
        PlayerEquipment peObj = new PlayerEquipment();
        peObj.playerGear();
        System.out.println(
                "you stomp through the desert landscape, sand gets stuck in your shoes, pants " + peObj.getMyObject1());
        // this will state whatever player is wearing to be affected by the sand

    }

    public void westArea() {
        pMap.westBiome();
        System.out.println(
                "as you walk west you see the tall grass shorten and lead to wet green grass before appearing in patches as you progress. Trees soon appear in droves making the atmosphere seem murky as it gets a bit misty in the path ahead.\n");

        System.out.println(
                "It gets darker and darker until you see an opening in the murky forest. You see a swamp with a small cottage with a porch supported by wooden beams.");
    }

   
    public void eastArea() {
        pMap.eastBiome();
        System.out.println(
                "heading east  you see the tall grass shorten until it becomes green as you march east. The grass then rises while appearing grass green. The trees you see ahead have vines loosely hanging on some branches. \n ");
        
    }
}