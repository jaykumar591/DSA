package id;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random platform = new Random();
        int platformId = platform.nextInt(80000000,89000000);
        System.out.println(platformId);
    }
}
