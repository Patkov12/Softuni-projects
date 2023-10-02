import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double usd = scanner.nextFloat();
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}