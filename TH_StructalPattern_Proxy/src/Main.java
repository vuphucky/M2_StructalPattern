// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MathCaculatorProxy mathProxy = new MathCaculatorProxy();
        double result = mathProxy.add(1,2);
        System.out.println("1 + 2 = " + result);
        result = mathProxy.add(2, Double.MAX_VALUE);
        System.out.println("2 + Double.max = " + result);
    }
}