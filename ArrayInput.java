import java.util.*;
public class ArrayInput {
    public static void main(String args[]){
        int f=0;
        int array1[] = new int[5];
        System.out.println("please enter elements of array");
        int i;
        for (i=0;i<5;i++){
            Scanner sc= new Scanner(System.in);
            array1[i] = sc.nextInt();
        }
        System.out.println("press 1 to find 2nd largest number\npress 2 to count even numbers in array");
        Scanner sc2 = new Scanner(System.in);
        int choice;
        choice = sc2.nextInt();
        int k,e,x = 0,y=0,g,h;
        if (choice ==2){
            for(k=0;k<5;k++){
                if(array1[k]%2==0){
                    f++;
                }
            }
            System.out.println("no.  of even number in array is: "+f);
        }
        else if (choice ==1){
            for (g=0;g<5;g++){
                for (h=0;h<5;h++){
                    if (array1[g]>array1[h]){
                        e= array1[g];
                    }
                    else{
                        x= array1[g];
                    }
                    y=x;
                }

            }
            if (x>y){
                System.out.println(x+" is second greatest no.");
            }
            else{
                System.out.println(y+" is the second greatest no.");
            }
            System.out.println("press N to exit");
        }
        String exitvar;
        Scanner sc3 = new Scanner(System.in);
        exitvar = sc3.next();

        if (exitvar=="N"){
            System.out.println("exiting now");
        }
        else{

        }
    }
}
