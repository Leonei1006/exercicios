package exercicios;

public class TesteWhileFor {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10){
            System.out.println(x);
            x = 1 + x;
        }
        System.out.println("===");
        for(int y = 1; y < 10; y++){
            System.out.println(y);
        }
        int idade = 15;
        while (idade < 18){
            System.out.println("Não pode beber!");
            idade++;
        }
        for (int idd = 15; idd < 18; idd++){
            if(idd < 18){
                System.out.println("Não pode dirigir!");
            }
        }
        int i = 0;
        while(i != 10){
            i++;

            System.out.println(i);
        }

    }
}
