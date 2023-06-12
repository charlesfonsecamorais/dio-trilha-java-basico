import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        Double saldo = 0.0;

        System.out.print("Digite o numero da Agencia: ");
        agencia = sc.next();
        System.out.print("Digite o numero da Conta: ");
        numeroConta = sc.nextInt();
        System.out.print("Digite o nome do Cliente: ");
        sc.nextLine();
        nomeCliente = sc.nextLine();
        System.out.print("Informe o Saldo: ");
        saldo = sc.nextDouble();
        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);

        sc.close();

    }
}
