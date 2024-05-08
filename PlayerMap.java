

public class PlayerMap {
    // map will appear as ascii art
    public static void main(String[] args) {
        
        String[] map = {
            "+---+---+---+---+---+",
            "|   |   |   |   |   |",
            "+---+---+---+---+---+",
            "|   |   |   |   |   |",
            "+---+---+---+---+---+",
            "|   |   | X |   |   |",
            "+---+---+---+---+---+",
            "|   |   |   |   |   |",
            "+---+---+---+---+---+",
            "|   |   |   |   |   |",
            "+---+---+---+---+---+"
        };
         // Display the map
         for (String row : map) {
            System.out.println(row);
        }
    }
}
