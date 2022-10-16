package Week3.core;

public class EmailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Logged to the e-mail account: " + data);
    }
}