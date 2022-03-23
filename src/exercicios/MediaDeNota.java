package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class MediaDeNota {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double notaA = leitor.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double notaB = leitor.nextDouble();
        double media = ((notaA * 3.5) + (notaB * 7.5)) / 11;
        System.out.println(String.format("Média = %.5f", media));


        leitor.close();
    }
}
