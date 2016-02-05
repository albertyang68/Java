
/**
 * Created by YZQ on 05/02/2016.
 */
public class Wall {

    private String color;
    private double width;
    private double height;
    private Decoration decoration;

    public Wall(String color, double width, double height, Decoration decoration) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.decoration = decoration;
    }

    public void paintWall(String color) {
        this.color = color;
        System.out.println("The wall is painted in " + color + " .");
    }

    private void drawOnWall(Decoration drawing) {
        this.decoration = drawing;
        System.out.println("The wall has " + drawing + " drawing on it.");
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
