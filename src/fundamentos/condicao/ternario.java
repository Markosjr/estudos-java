package fundamentos.condicao;

import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {
        
        // SE O VALOR FOR MENOR QUE 20 = DESCONTO DE 0.1
        // MAIOR QUE 20 DESCONTO DE 0.5

        Scanner sc= new Scanner(System.in);

        Double preco = sc.nextDouble();

        double desconto = (preco < 20) ? preco*0.1 : preco*0.5;

        System.out.println(desconto);
        sc.close();
    }
}
