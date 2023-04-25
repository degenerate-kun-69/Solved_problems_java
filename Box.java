public class Box {

    private float width;

    private float height;

    private float depth;


    public Box(Box box) {

        this.width = box.width;

        this.height = box.height;

        this.depth = box.depth;

    }

    public Box(float width, float height, float depth) {

        this.width = width;

        this.height = height;

        this.depth = depth;

    }


    public Box() {

        this.width = 0;

        this.height = 0;

        this.depth = 0;

    }

    public float getWidth() {

        return width;

    }

    public void setWidth(float width) {

        this.width = width;

    }

    public float getHeight() {

        return height;

    }

    public void setHeight(float height) {

        this.height = height;

    }

    public float getDepth() {

        return depth;

    }

    public void setDepth(float depth) {

        this.depth = depth;

    }

    public void displayVolume() {

        float volume = width * height * depth;

        System.out.println("The volume of the box is: " + volume);

    }

}
