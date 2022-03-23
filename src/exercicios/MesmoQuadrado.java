package exercicios;

import java.util.Scanner;

public class MesmoQuadrado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();
        int y = 2;
        // Para todos os números de X divisíveis por Y
        for (int i = y; i <= num; i++ ){
            if (i % y == 0){
                int x = i * i;
                System.out.printf("%d^2 = %d \n", i, x);
            }
        }
    }
}
