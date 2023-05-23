import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String nome = "Iury Ravanello Nogueira";
        String tipoConta = "Corrente";
        double saldo = 1650.89;
        int opcao = 0;
        double valorTransferido = 0;
        double valorRecebido = 0;


        System.out.println("*************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: \n" + saldo);
        System.out.println("*************************");

        String menu = """
                *** Digite sua opção ***
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){

                System.out.println("Seu saldo é de R$" + saldo);

            } else if (opcao == 2) {

                System.out.println("Digite o valor a ser transferido: ");
                valorTransferido = leitura.nextDouble();

                if(valorTransferido < saldo){

                    saldo -= valorTransferido;
                    System.out.println("Valor transferido com sucesso, seu saldo agora é de R$" + saldo);

                } else {
                    System.out.println("Impossível realizar a solicitação: Saldo insuficiente");
                }

            } else if (opcao == 3){

                System.out.println("Digite o valor a ser recebido: ");
                valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Seu saldo agora é de R$" + saldo);

            } else if (opcao != 4) {

                System.out.println("Opção inválida.");
                break;

            }
        }
    }
}