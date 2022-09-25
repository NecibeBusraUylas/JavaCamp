package Week2.ReCapClasses;

public class Main{

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int result = calculator.add(12,4);
        System.out.println(result);
        int result2 = calculator.subract(12,4);
        System.out.println(result2);
        int result3 = calculator.multiply(12,4);
        System.out.println(result3);
        int result4 = calculator.divide(12,4);
        System.out.println(result4);
    }
}