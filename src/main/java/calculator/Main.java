package calculator;

public class Main {
    public static void main(String[] args) {
        Ints calculator=new IntsCalculator();
        System.out.println(calculator.sum(23,57));
        System.out.println(calculator.pow(2,4));
        System.out.println(calculator.mult(4,10));
    }
}
