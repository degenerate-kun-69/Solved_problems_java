public class Ans1
{
    int a,b,c;
    public double getArea()
    {
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
    }
    public double getPerimeter(){
        return (a+b+c);
    }
}

    class Triangle{
        public static void main(String[] args){
            Ans1 t = new Ans1();
            t.a = 3;
            t.b = 4;
            t.c = 5;
            System.out.println("area is "+ t.getArea());
            System.out.println("perimeter is "+t.getPerimeter());
	}
    }
