package exercicios;

public class NumerosMultiplos {
    public static void main(String[] args) {
        int num = 100;
        int x = 3;
        for(int i = x; i <= num; i++){
            if(i  % x == 0) System.out.println("Os números" +
                    "múltiplos de 3 de 1 a 100 são: " + i);

        }
    }
}
