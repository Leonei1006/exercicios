package exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int fat = 1;
        System.out.print("Digite um número para calcular " +
                "seu fatorial: ");
        int num = leitor.nextInt();
        if (num >= 0){
            for (int i = 1; i <= num; i++){
                fat = fat * i;
            }
            System.out.println("O fatorial é: " + fat + "!");
        }else{
            System.out.println("Número inválido.");
        }

        leitor.close();

    }
}
