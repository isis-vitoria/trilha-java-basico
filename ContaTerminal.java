
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta que deve conter quatro digitos: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência que deve conter quatro digitos: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo
                + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}
