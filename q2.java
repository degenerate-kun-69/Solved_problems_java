import java.util.*;
class vehicle{
    public void display(){
        System.out.println("this is a vehicle");
    }
}
class car extends vehicle{
    public void display(){
        System.out.println("this is a car");
    }
}
class bike extends vehicle{
    public void display(){
        System.out.println("this is a bike");
    }
}
public class q2 {
    public static void main(String[] args) {
        int N;
        Scanner sc= new Scanner(System.in);
        N = sc.nextInt();
        if(N==2){
            bike ob1 = new bike();
            ob1.display();
        }
        else if(N==4){
            car ob2 = new car();
            ob2.display();
        }
        else{
            vehicle ob3 = new vehicle();
            ob3.display();
        }
    }
}