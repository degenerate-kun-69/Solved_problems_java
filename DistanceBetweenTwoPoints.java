//to calculate dist between two points(x1,y1) and (x2, y2) using classes and objects
//data type double to store large values
import java.util.*;
class DistanceCal{
    double x1,x2,y1,y2,dist;
    DistanceCal(double x1,double y1,double x2,double y2){
        //using this keyword because the class is same
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public double CalDistance(){
        dist=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        return dist;
    }
}
class distance{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x1,x2,y1,y2;
        System.out.print("Enter x1 and y1 ");
        x1=in.nextDouble();
        y1=in.nextDouble();
        System.out.print("Enter x2 and y2 ");
        x2=in.nextDouble();
        y2=in.nextDouble();
        //creating objectD
        DistanceCal dc = new DistanceCal(x1,y1,x2,y2);
        System.out.println("Distance between the given 2 point "+dc.CalDistance());
    }
}