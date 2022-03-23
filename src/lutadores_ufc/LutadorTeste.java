package lutadores_ufc;

public class LutadorTeste {

    public static void main(String[] args) {

        Lutador lutador1 = new Lutador();
        lutador1.setNome("José ");
        lutador1.setNacionalidade("Brasil");
        lutador1.setIdade(35);
        lutador1.setPeso(73.8);
        lutador1.setVitorias(23);
        lutador1.setEmpates(3);
        lutador1.setDerrotas(2);
        //lutador1.apresentar();

        Lutador lutador2 = new Lutador();
        lutador2.setNome("Jack ");
        lutador2.setNacionalidade("EUA");
        lutador2.setIdade(28);
        lutador2.setPeso(75.8);
        lutador2.setVitorias(16);
        lutador2.setEmpates(2);
        lutador2.setDerrotas(4);
        //lutador2.apresentar();

        Lutador lutador3 = new Lutador();
        lutador3.setNome("Jean ");
        lutador3.setNacionalidade("França");
        lutador3.setIdade(31);
        lutador3.setPeso(86.4);
        lutador3.setVitorias(19);
        lutador3.setEmpates(4);
        lutador3.setDerrotas(6);
        //lutador3.apresentar();

        Lutador lutador4 = new Lutador();
        lutador4.setNome(" Kane ");
        lutador4.setNacionalidade("Iglaterra");
        lutador4.setIdade(27);
        lutador4.setPeso(92.4);
        lutador4.setVitorias(28);
        lutador4.setEmpates(1);
        lutador4.setDerrotas(1);
        //lutador4.apresentar();

        Lutador lutador5 = new Lutador();
        lutador5.setNome(" Maurilio ");
        lutador5.setNacionalidade("Portugal");
        lutador5.setIdade(38);
        lutador5.setPeso(97.2);
        lutador5.setVitorias(46);
        lutador5.setEmpates(7);
        lutador5.setDerrotas(6);
        //lutador5.apresentar();

        Lutador lutador6 = new Lutador();
        lutador6.setNome(" Maurilio ");
        lutador6.setNacionalidade("Portugal");
        lutador6.setIdade(25);
        lutador6.setPeso(102.2);
        lutador6.setVitorias(14);
        lutador6.setEmpates(3);
        lutador6.setDerrotas(3);
        //lutador6.apresentar();

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(lutador6, lutador5);
        UFC01.lutar();
        System.out.println();
        lutador6.status();
        System.out.println();
        lutador5.status();

    }
}
