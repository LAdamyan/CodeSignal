package recursion;

public class Main {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.factorial(5));
        System.out.println(recursion.fibonacci(8));
        System.out.println(recursion.sumOfDigits(156));
        recursion.printNumbers(10);
        System.out.println(recursion.power(3,2));
        System.out.println(recursion.isPrime(4,1));
        System.out.println(recursion.gcd(15,5));
        System.out.println(recursion.calculateFactorial(3));

    }
}
