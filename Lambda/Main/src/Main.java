public class Main{
    public static void main(String[] args) {

        Calculator calculator = new Addition();

        // Khong lambda
        int result = calculator.calculate(10, 5,2);
        System.out.println(result);

        // Lambda
        Calculator calculator1 = (a, b,x) -> a - b - x;
        int result2 = calculator1.calculate(1,1,2);
        System.out.println(result2);

    }
}