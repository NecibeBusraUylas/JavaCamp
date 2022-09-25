package Week2.Methods;

public class Main{

    public static void main(String[] args){
        findNumber();

        int total = add(6,7);
        System.out.println(total);

        int sum= add(1,2,3,4,5,6,7);
        System.out.println(sum);
    }

    public static void findNumber(){
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int search = 12;
        boolean isContain = false;
        for (int number : numbers) {
            if (number == search) {
                isContain = true;
                break;
            }
        }
        if (isContain) {
            message(search + " mevcuttur.");
        } else {
            message(search + " mevcut değildir.");
        }
    }

    public static void message(String message){
        System.out.println(message);
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int ... numbers){
        int sum=0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}