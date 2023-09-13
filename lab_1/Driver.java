public class Driver {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double x = 5.0;
        double y = 6.0  ;
        System.out.printf("%s + %s = "+calculator.add(x, y), x, y);
        System.out.printf("\n%s * %s = "+calculator.multiply(x, y), x, y);
    }
}
