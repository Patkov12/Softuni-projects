import java.util.Scanner;

public class ConcatenateName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int c = Integer.parseInt(scanner.nextLine());
        String d = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",a,b,c,d);
    }
}
