public class main2 {
    public static void main(String args[]){
        Rectangle ob1 = new Rectangle(4,5);
        Rectangle ob2 = new Rectangle(5,8);
        ob1.Area();
        ob2.Area();
    }
}
class Rectangle{
   int height;
   int width;

    Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
void Area(){
        System.out.println("Area of rectangle is "+ height*width );
    }


}