import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = 0;
        double saque = 0;

        for (int i = 1; ; i++) {

            try {
                limiteDiario = scanner.nextDouble();
                if (limiteDiario == 0) {
                    System.out.println("Transacoes encerradas.");
                    break;
                } else {
                saque = scanner.nextDouble();
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro ao ler os valores de entrada.");
                scanner.close();
                return;
            }

            if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                System.out.println("Saque realizado. Limite restante: " + (limiteDiario - saque));
            }
        }

        scanner.close();
    }

}