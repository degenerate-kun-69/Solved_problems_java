
class complex_numbers {
    int real, imaginary;
    // Empty Constructor
    complex_numbers()
    {
    }
    // Constructor to accept
    // real and imaginary part
    complex_numbers(int tempReal, int tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }
    // Defining addComp() method
    // for adding two complex_numbers number
    complex_numbers addComp(complex_numbers C1, complex_numbers C2)
    {
        // creating temporary variable
        complex_numbers temp = new complex_numbers();
        // adding real part of complex_numbers numbers
        temp.real = C1.real + C2.real;
        // adding Imaginary part of complex_numbers numbers
        temp.imaginary = C1.imaginary + C2.imaginary;
        // returning the sum
        return temp;
    }
    // Defining subtractComp() method
    // for subtracting two complex_numbers number
    complex_numbers subtractComp(complex_numbers C1, complex_numbers C2)
    {
        // creating temporary variable
        complex_numbers temp = new complex_numbers();
        // subtracting real part of complex_numbers numbers
        temp.real = C1.real - C2.real;
        // subtracting Imaginary part of complex_numbers numbers
        temp.imaginary = C1.imaginary - C2.imaginary;
        // returning the difference
        return temp;
    }
    // Function for printing complex_numbers number
    void printcomplex_numbersNumber()
    {
        System.out.println("complex_numbers number: "
                + real + " + "
                + imaginary + "i");
    }
}
// Main Class
public class complexnum {
    // Main function
    public static void main(String[] args)
    {
        System.out.println(" enter real and imaginary parts");
       // First complex_numbers number
        complex_numbers C1 = new complex_numbers(3, 2);
        // printing first complex_numbers number
        C1.printcomplex_numbersNumber();
        // Second complex_numbers number
        complex_numbers C2 = new complex_numbers(9, 5);
        // printing second complex_numbers number
        C2.printcomplex_numbersNumber();
        // for Storing the sum
        complex_numbers C3 = new complex_numbers();
        // calling addComp() method
        C3 = C3.addComp(C1, C2);
        // printing the sum
        System.out.print("Sum of ");
        C3.printcomplex_numbersNumber();
        // calling subtractComp() method
        C3 = C3.subtractComp(C1, C2);
        // printing the difference
        System.out.print("Difference of ");
        C3.printcomplex_numbersNumber();
   }
}