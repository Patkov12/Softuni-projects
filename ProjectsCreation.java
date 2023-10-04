import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        int c = b*3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",a,c,b);
    }
}
