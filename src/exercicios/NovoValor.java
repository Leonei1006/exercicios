package exercicios;

import java.util.Scanner;

public class NovoValor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        if (num % 2 ==0){
            num = num / 2;
            System.out.println("Este numero é par.");
            System.out.println(num);
        }else {
            num = 3 * num + 1;
            System.out.println("O número digitado é impar.");
            System.out.println(num);
        }

        input.close();
    }
}
