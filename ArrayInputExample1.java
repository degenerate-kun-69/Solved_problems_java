import java.util.Scanner;
public class ArrayInputExample1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter  
        n = sc.nextInt();
//creates an array in the memory of length 5 
        int[] array = new int[5];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
//reading array elements from the user   
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
// accessing array elements using the for loop  
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);

        }
        int sum = 0;
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}