package exercicios;

public class CanetaTeste {
    public static void main(String[] args) {

        Caneta caneta1 = new Caneta();
        caneta1.setModelo("Montblanc");
        caneta1.setPonta(0.7);
        caneta1.setCor("Preto");
        System.out.println("Caneta modelo: " + caneta1.getModelo() + "\nDe ponta: "
                + caneta1.getPonta() + "\nCor: " + caneta1.getCor());


    }

}
