import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Para consumir a quebra de linha pendente
        System.out.println("Por favor, digite o número da conta:");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();
        Double saldo = 237.48;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}