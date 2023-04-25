import java.util.Scanner;
class A {
    int d1, d2, d3;
    A(){d1=d2=d3=0;}
    A(int d1, int d2, int d3)
    {
        this.d1= d1;
        this.d2= d2;
        this.d3 =d3;
    }
    void CalcArea()
    {
        // System.out.println("Area of shape 1 is "+ d1*d2*d3);
    }
    int CalcArea(int c, int c1)
    {

        return (c*c1);
    }
}

public class Area
{
    public static void main(String args[])
    {
        int c1, c2, c;
        System.out.println("Enter value of 3 parameters: ");
        Scanner sc= new Scanner(System.in);

        c = sc.nextInt();
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        A a=new A(c,c1,c2);
        A b=new A();
        a.CalcArea();
        System.out.println("area of shape 1 is "+a.CalcArea(c,c1));
        b.CalcArea();
        System.out.println("area of shape 2 is "+b.CalcArea(c1,c2));
    }
}