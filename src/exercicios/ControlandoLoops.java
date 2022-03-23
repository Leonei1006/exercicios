package exercicios;

public class ControlandoLoops {
    public static void main(String[] args) {
        int x = 100;
        int y = 5;
        // Para todos os números de X divisíveis por Y
        for (int i = y; i <= x; i++ ){
            if (i % y == 0){
                System.out.println("Os números de X divisíveis por Y com resto 0 são: " + i);
            }
        }
        // Para o primeiro número X divisível por Y.
        for(int i = y; i <= x; i++){
            if (i % y == 0) {
                System.out.println("O primeiro número dentro de X divisível por Y é: " + i);
                break;
            }
        }
        for (int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                continue;
            }
            System.out.println(i);
        }


    }
}
