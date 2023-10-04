import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = 0.18*(a*7.61);
        double c = (a*7.61)-b;
        System.out.printf("The final price is: %.2f lv.",c );
        System.out.printf("\nThe discount is: %.2f lv.",b);

    }
}
