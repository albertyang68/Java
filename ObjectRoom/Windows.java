/**
 * Created by YZQ on 05/02/2016.
 */
public class Windows {

    private float width;
    private float height;
    private float direction;
    private boolean covered;

    public Windows(float width, float height, float direction, boolean covered) {
        this.width = width;
        this.height = height;
        this.direction = direction;
        this.covered = covered;
    }

    private void openWindow() {
        if(this.covered) {
            this.covered = false;
            System.out.println("Window opened.");
        } else{
            System.out.println("You did not shut it down before.");
        }
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getDirection() {
        return direction;
    }

    public boolean isCovered() {
        return covered;
    }
}
