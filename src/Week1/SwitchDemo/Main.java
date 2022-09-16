package Week1.SwitchDemo;

public class Main{

    public static void main(String[] args){
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Perfect: Passed!");
                break;
            case 'B':
                System.out.println("Very Good: Passed!");
                break;
            case 'C':
                System.out.println("Good: Passed!");
                break;
            case 'D':
                System.out.println("Okay: Passed!");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Incorrect input.");
        }

    }
}