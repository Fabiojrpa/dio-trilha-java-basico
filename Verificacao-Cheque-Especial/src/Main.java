import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo;
        double saque;
        double limiteChequeEspecial;
        try {
            saldo = scanner.nextDouble();
            saque = scanner.nextDouble();
            limiteChequeEspecial = 500;
        } catch (InputMismatchException e){
            System.out.println("Erro ao ler os valores de entrada.");
            scanner.close();
            return;
        }

        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else if (saque > saldo && saque <= (saldo + limiteChequeEspecial)) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        scanner.close();
    }
}