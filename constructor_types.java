public class constructor_types
{
    int n1, n2;
    constructor_types( int n1, int n2)
    {
        this.n1= n1;
        this.n2= n2;
    }
    void display()
    {
     System.out.println(n1*n2);
    }
    public static void main(String[] args)
    {
        constructor_types obj = new constructor_types(43,22);
        obj.display();
    }

}