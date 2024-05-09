import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroConta = scanner.nextLine();

        try {
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

        private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        if (numeroConta.length() != 8)
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
    }
}