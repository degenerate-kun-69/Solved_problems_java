//superclass
class person{
    String name;
    public person(){
        System.out.println("constr1uctor of parent class");
    }
    void display(){
        System.out.println("name is "+ name);
    }
}
//subclass
class student extends person{
    int marks;
    public student(){
        System.out.println("constructor of child class");
    }
    void print(){
        System.out.println("marks are "+marks);}
}
public class test2
{
    public static void main(String args[]){
        // creating an object of subclass
        student st = new student();
        st.display();
        st.print();

    }
}
