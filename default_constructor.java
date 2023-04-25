public class default_constructor
{
    int num1= 29;
    void display()
    {
        System.out.println("example of default constructor");
    }
    public static void main(String[] args)
    {
        default_constructor obj = new default_constructor();
        obj.display();
        System.out.println(obj.num1);
    }
}
