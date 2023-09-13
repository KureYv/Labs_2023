public class Driver { //Driver class
    public static void main(String[] args) { //Main method
        Calculator calculator = new Calculator(); //Creating a new calculator object
        double x = 5.0; //Declaring two floats x and y with different values
        double y = 6.0  ;
        System.out.printf("%.1f + %.1f = %.1f", x, y, calculator.add(x, y)); //Printing the result with printf for addition formatting it to 1 dp 
        System.out.printf("\n%.1f * %.1f = %.1f", x, y, calculator.multiply(x, y)); //Printing the result with printf for multiplication formatting it to 1 dp
    }
}
