package fundamentos.condicao;

import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50.0;

        if (minutos <= 100){
            System.out.println("O valor a ser pago é R$50,00 reais" );
        }

        if (minutos>100){
            conta = conta + (minutos - 100) * 2.0;

            System.out.printf("O valor a ser pago é = R$ %.2f%n", conta);

        }

        sc.close();
    }
}
