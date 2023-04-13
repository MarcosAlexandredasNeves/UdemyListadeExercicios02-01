import java.util.Scanner;

public class EX01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();

        System.out.println("Digite um número: ");
        n1 = scanner.nextInt();
        if (n1 < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }

        scanner.close();
    }
}
