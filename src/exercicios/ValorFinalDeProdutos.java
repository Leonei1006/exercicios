package exercicios;

import java.io.IOException;
import java.util.Scanner;


public class ValorFinalDeProdutos {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int codi1 = leitor.nextInt();
        int numeroDeUnidades1 = leitor.nextInt();
        double precoPorUnidade1 = leitor.nextDouble();

        int codi2 = leitor.nextInt();
        int numeroDeUnidades2 = leitor.nextInt();
        double precoPorUnidade2 = leitor.nextDouble();
        double valorAPagar = precoPorUnidade1 * numeroDeUnidades1 + precoPorUnidade2 * numeroDeUnidades2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorAPagar);
        System.out.println();

    }

}