public class Main {

    public static void main(String[] arg) {
        Decoration decoration1 = new Decoration(0.1, 0.3, "yellow", "circle", "paint");
        Decoration decoration2 = new Decoration(1, 3, "red", "rectangle", "post");
        Door theDoor = new Door(3, 2, "Wood", "FingerPrint", decoration1);
        Wall theWall = new Wall("Blue", 10, 3.5, decoration2);
        Windows theWindow = new Windows(2, 2, 45, true);
        Chair theChair = new Chair("Plastic", true, false, 300);

        Room theRoom = new Room(decoration1, decoration2,theDoor, theWall, theWindow, theChair);

        theRoom.getChair().canHold(500);
        theRoom.getDoor().openTheDoor();
        System.out.println(theWall.getColor());
        theRoom.getWall().paintWall("Orange");
        System.out.println(theWall.getColor());
    }
}
