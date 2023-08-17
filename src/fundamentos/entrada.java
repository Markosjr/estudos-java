package fundamentos;

import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
 
        double numero;

        numero = sc.nextDouble();



 /* 
        int numero;

        numero = sc.nextInt();
*/

        System.out.println("Você digitou " +numero);


/* 
        String nome = sc.next();

        System.out.println("Seja Bem vindo, " +nome);
*/
        sc.close();
    }
}
