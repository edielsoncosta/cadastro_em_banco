import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Conta: ");
        int idConta = sc.nextInt();
        System.out.println("nome: ");
        String nome = sc.next();
        System.out.println("deposito inicial? (y/n)");
        String resposta = sc.next();

        Banco banco;
        if(resposta.equalsIgnoreCase("y")) {
            System.out.println("Valor deposito inicial: ");
            double deposito = sc.nextDouble();
            banco = new Banco(idConta, nome, deposito);
        } else {
            banco = new Banco(idConta, nome);
        }

        System.out.println(banco);

        System.out.println("Valor de novo deposito: ");
        double deposito = sc.nextDouble();
        banco.Deposito(deposito);

        System.out.println(banco);

        System.out.print("Valor de saque: ");
        double saque = sc.nextDouble();
        banco.saque(saque);

        System.out.println(banco);

        sc.close();
    }
}