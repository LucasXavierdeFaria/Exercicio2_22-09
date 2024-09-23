import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int operacoes = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Bem vindo ao sistema Bancário -----");

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite a sua conta bancária: ");
        String numeroConta = scanner.next();

        System.out.println("Qual será o valor a ser iniciado na conta? ");
        double money = scanner.nextDouble();

        ContaBancaria conta1 = new ContaBancaria(nome, numeroConta, money);

        System.out.println("Qual será o valor a ser operado? ");
        double moneyOperation = scanner.nextDouble();

        while (operacoes == 1) {
            System.out.println("Qual operação deseja realizar? ");
            System.out.println("1- Despósito ");
            System.out.println("2- Saque");
            System.out.println("3- Alterar valor que será operado");
            System.out.println("4- Consultar Saldo");
            System.out.println("5- Sair");
            int choice = scanner.nextInt();
            if (choice == 5) {
                operacoes = 0;
            }
            switch(choice){
                case 1:
                    conta1.depositar(moneyOperation);
                    break;
                case 2:
                    conta1.sacar(moneyOperation);
                    break;
                case 3:
                    System.out.println("Qual será o valor a ser operado? ");
                    moneyOperation = scanner.nextDouble();
                case 4:
                    conta1.consultarSaldo();
                    break;
                case 5:
                    operacoes = 0;
                    break;
                default:
                    System.out.println("Opção errada, digite novamente!");
                    return;
            }
        }
        System.out.println("Obrigado por utilizar o novo sistema!");
        scanner.close();
    }
}