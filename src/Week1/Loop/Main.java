package Week1.Loop;

public class Main{

    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("For loop is over.");

        // while loop with odd numbers
        System.out.println("odd numbers");
        int i= 1;
        while( i<=10){
            System.out.println(i);
            i += 2;
        }
        System.out.println("While loop is over.");

        // do-while loop with even numbers
        System.out.println("even numbers");
        int j= 2;
        do{
            System.out.println(j);
            j += 2;
        } while( j<=10);
        System.out.println("Do-While loop is over.");
    }
}