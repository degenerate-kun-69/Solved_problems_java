//inheritance example
class shape{
    public void m(){
        System.out.println("this is a shape");
    }
}
class circle extends shape{
    public void m4(){
        System.out.println("this is a circle");

    }
}
class rectangle extends shape{
    public void m1(){
        System.out.println("this is a rectangle");
    }
}
class square extends rectangle{
    public void m2(){
        System.out.println("this is a square");
    }
}
public class Test {
    public static void main(String args[]){
        circle c= new circle();
        rectangle r= new rectangle();// creating object
        square s= new square();// creating object s of Square class
        r.m();
        r.m1();
        System.out.println("****");
        s.m();
        s.m1();
        s.m2();
    }
}
