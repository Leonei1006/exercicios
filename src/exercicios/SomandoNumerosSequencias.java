package exercicios;

public class SomandoNumerosSequencias {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 1000){
            System.out.println(num);
            num = num + (num + 1);

        }
    }
}
