package Week1.Strings;

public class Main{

    public static void main(String[] args){
        String message = "The weather is so good today.";
        System.out.println(message);

        System.out.println("Element number: " + message.length());
        System.out.println("5. element: " + message.charAt(4));
        System.out.println(message.concat(" Yeey!"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("."));
        char [] c = new char[5];
        message.getChars(0,5,c,0);
        System.out.println(c);
        System.out.println(message.indexOf('a'));
        System.out.println(message.indexOf("we"));
        System.out.println(message.lastIndexOf("we"));

        String newMessage = message.replace(' ', '-');
        System.out.println("New Message is: " + newMessage);
        System.out.println(message.substring(2));
        System.out.println(message.substring(2,7));

        System.out.println("---------");

        for (String word: message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
    }
}