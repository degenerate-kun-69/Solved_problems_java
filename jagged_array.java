import java.util.Scanner;
public class jagged_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int z;
        System.out.println("Enter the number of rows for jagged arrays");
        z = sc.nextInt();
        int arr[][] = new int[z][];
        System.out.println("Enter the number of columns for each rows of jagged arrays");
        for (int i = 0; i < z; i++) {
            arr[i] = new int[sc.nextInt()];
        }
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println("Elements of Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

}