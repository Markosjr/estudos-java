package fundamentos.condicao;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        if(x == 1){
            dia = "Domingo";
        } else if (x==2){
            dia = "Segunda";
        } else if (x==3){
            dia = "Terça-feira";
        } else if(x==4){
            dia = "Quarta-feira"; 
        } else if (x==5){
            dia = "Quinta-feira";
        } else if (x==6){
            dia = "Sexta-feira";
        } else if (x==7){
            dia = "sabado";
        } else {
            dia = "Valor Inválido";
        }

        sc.close();
    }
}
