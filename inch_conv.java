import java.util.Scanner;

public class inch_conv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = a*2.54;
        System.out.println(b);
    }
}
