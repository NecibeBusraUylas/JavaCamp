package Week3.core;

public class DatabaseLogger implements  Logger{
    @Override
    public void log(String data) {
        System.out.println("Logged to the database: " + data);
    }
}
