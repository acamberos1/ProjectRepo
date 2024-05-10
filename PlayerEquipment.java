

public class PlayerEquipment {
    String myObject1 = "normal hoodie";
    String myObject2 = "feeble stick";
    public void playerGear() {
        int healthPoints = 10;
        
     
        // right now will be invisible to user and events will trigger game over
        System.out.println("current items equipped  " + myObject1 + " and a " + myObject2);

    }
    public String getMyObject1() {
        return myObject1;
    }
    public String getMyObject2() {
        return myObject2;
    }

    public void setMyObject2(String newObject) {
        myObject2 = newObject;
    }
    
    
}
