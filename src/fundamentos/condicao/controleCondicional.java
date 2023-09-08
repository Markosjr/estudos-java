package fundamentos.condicao;

import java.util.Scanner;

public class controleCondicional {
    public static void main(String[] args) {

        
        Scanner sc= new Scanner(System.in);

        double horas = sc.nextDouble();
        
        
        if (horas >= 6 && horas <=12){
        System.out.println("Bom dia");
        }
        if (horas>= 13 && horas <=18){
        System.out.println("Boa tarde");
        }
        if(horas>= 19 && horas <=5){
        System.out.println("Boa Noite");
        }
        sc.close();
        
    }
}



