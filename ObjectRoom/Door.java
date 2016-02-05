/**
 * Created by YZQ on 05/02/2016.
 */
public class Door {

    private float height;
    private float width;
    private String material;
    private String lockType;
    private boolean isOpen;
    private Decoration decoration;

    public Door(float height, float width, String material, String lockType, Decoration decoration) {
        this.height = height;
        this.width = width;
        this.material = material;
        this.lockType = lockType;
        this.isOpen = false;
        this.decoration = decoration;
    }

    public void openTheDoor() {
        if(this.isOpen) {
            System.out.println("The door is unlocked.");
        } else{
            this.isOpen = true;
            System.out.println("Opening...");
        }
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }

    public String getLockType() {
        return lockType;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Decoration getDecoration() {
        return decoration;
    }
}
