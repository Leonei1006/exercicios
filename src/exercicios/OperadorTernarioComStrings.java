
package exercicios;

import java.io.IOException;
import java.util.Scanner;


public class OperadorTernarioComStrings {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String T = leitor.nextLine();
        //TODO: Complete operador condicional (ternário) abaixo.
        System.out.println(T.length() <= 140 ?"TWEET" : "MUTE" );
    }

}
