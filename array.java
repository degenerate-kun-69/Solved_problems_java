import java.util.*;
public class array {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        int d = 5;
        int i, j;
        int ev_arr= d*d;
        int[][] array = new int[d][d];
        int[] even;
        int[] odd;
        odd =new int[ev_arr];
        even = new int[ev_arr];
        // for loop applied here to input 2d array
        for (i = 0; i < d; i++) {
            for (j = 0; j < d; j++) {
                array[i][j] = sc.nextInt();

            }

        }
        System.out.println("the given array is:");
        // for loop applied here to print 2d array
        for (i = 0; i < d; i++) {
            for (j = 0; j < d; j++) {
                System.out.println(array[i][j]);

            }
        }
        //sorting algorithm loop
        for (i = 0; i < d; i++) {
            for (j = 0; j < d; j++) {
                if (array[i][j]%2 ==0){
                    // trying to put even elements into another array, will do the same with odd elements
                        even[i]= array[i][j];
                        System.out.println("even="+even[i]);
                }
                else
                {
                    odd[i]= array[i][j];
                    System.out.println("odd="+odd[i]);
                }
            }
        }
        System.out.println(even.length);
    }
}