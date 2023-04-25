import java.util.*;


public class Main {
    // Java program to find index of
// an element in N elements


    // Function to find the index of an element
    public static int findIndex(int arr[], int t)
    {

        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }
    // Driver Code
    public static void main(String[] args)
    {
        int Size, i;
        System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();
        System.out.println("Enter elements in array");

        int my_array[] = new int[10];
        Scanner sc=new Scanner(System.in);
        // find the index of 5
       System.out.println("Index position of  is: "
                + findIndex(my_array, 5));

//         find the index of 7
        System.out.println("Index position of 7 is: "
                + findIndex(my_array, 7));

 }
}
