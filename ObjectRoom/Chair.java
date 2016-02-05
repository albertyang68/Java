/**
 * Created by YZQ on 05/02/2016.
 */
public class Room {

    private Decoration decoration1;
    private Decoration decoration2;
    private Door door;
    private Wall wall;
    private Windows window;
    private Chair chair;


    public Room(Decoration decoration1, Decoration decoration2, Door door, Wall wall, Windows window, Chair chair) {

        this.decoration1 = decoration1;
        this.decoration2 = decoration2;
        this.door = door;
        this.wall = wall;
        this.window = window;
        this.chair = chair;
    }

    public Decoration getDecoration1() {
        return decoration1;
    }

    public Decoration getDecoration2() {
        return decoration2;
    }

    public Door getDoor() {
        return door;
    }

    public Wall getWall() {
        return wall;
    }

    public Windows getWindow() {
        return window;
    }

    public Chair getChair() {
        return chair;
    }

}
