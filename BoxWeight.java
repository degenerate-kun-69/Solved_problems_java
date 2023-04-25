public class BoxWeight extends Box {

    private float weight;

    public BoxWeight(BoxWeight boxWeight) {

        super(boxWeight);

        this.weight = boxWeight.weight;

    }

    public BoxWeight(float width, float height, float depth, float weight) {

        super(width, height, depth);

        this.weight = weight;

    }


    public BoxWeight() {

        super();

        this.weight = 0;

    }

    public float getWeight() {

        return weight;

    }

    public void setWeight(float weight) {

        this.weight = weight;

    }

    public void displayWeight() {

        System.out.println("The weight of the box is: " + weight);

    }

}
