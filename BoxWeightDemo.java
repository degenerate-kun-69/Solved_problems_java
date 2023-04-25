public class BoxWeightDemo {

    public static void main(String[] args) {

        Box box1 = new Box();

        box1.setWidth(2);

        box1.setHeight(3);

        box1.setDepth(4);

        box1.displayVolume();

        Box box2 = new Box(5, 6, 7);

        box2.displayVolume();

        Box box3 = new Box(box1);

        box3.displayVolume();

        BoxWeight boxWeight1 = new BoxWeight();

        boxWeight1.setWidth(2);

        boxWeight1.setHeight(3);

        boxWeight1.setDepth(4);

        boxWeight1.setWeight(10);

        boxWeight1.displayVolume();

        boxWeight1.displayWeight();

        BoxWeight boxWeight2 = new BoxWeight(5, 6, 7, 20);

        boxWeight2.displayVolume();

        boxWeight2.displayWeight();

        BoxWeight boxWeight3 = new BoxWeight(boxWeight1);

        boxWeight3.displayVolume();

        boxWeight3.displayWeight();

    }

}