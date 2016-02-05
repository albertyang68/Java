/**
 * Created by YZQ on 05/02/2016.
 */
public class Decoration {
    private double width;
    private double height;
    private String color;
    private String shape;
    private String meaning;

    public Decoration(double width, double height, String color, String shape, String meaning) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.shape = shape;
        this.meaning = meaning;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }

    public String getMeaning() {
        return meaning;
    }
}
