import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;


        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {

           // System.out.println("Por Favor digite uma opção: \n 1.Depositar\n 2.Sacar\n 3.Consultar Saldo\n 0.Encerrar");
            int opcao = scanner.nextInt();

            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao) {
                case 0:
                    System.out.println("Programa Encerrado.");
                    return;
                case 1:
                   // System.out.println("Digite o valor do deposito:");
                    double depositar = scanner.nextDouble();
                    saldo += depositar;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double sacar = scanner.nextDouble();
                    if (sacar <= saldo){
                        saldo -= sacar;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo Insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }


        }
    }
}
