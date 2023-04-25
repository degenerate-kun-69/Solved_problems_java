import java.util.Scanner;

public class Main {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);

            System.out.println("enter your marks\n");

            // Reading data using readLine
            float l = in.nextFloat();



            if (l >=25 && l<45 ){




            System.out.print("\n");
            System.out.println("e");}
            else if (l>=50 && l<60)
            {  System.out.println("D");}
            else if (l>=60 && l<80)
            {  System.out.println("c");}
            else if (l>=80 && l<50)
            {  System.out.println("B");}
            else {System.out.println("f :(");}
        }
    }