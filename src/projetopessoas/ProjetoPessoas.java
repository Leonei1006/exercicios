package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {

        Pessoa pes1 = new Pessoa();
        Aluno pes2 = new Aluno();
        Professor pes3 = new Professor();
        Funcionario pes4 = new Funcionario();

        pes1.setNome("Joaquim");
        pes1.setIdade(45);
        pes1.setSexo("M");
        System.out.println(pes1.toString());
        System.out.println();

        pes2.setNome("Gustavo");
        pes2.setIdade(25);
        pes2.setSexo("M");
        pes2.setCurso("Engenharia de Software");
        System.out.println(pes2.toString());
        System.out.println();

        pes3.setNome("Maria");
        pes3.setIdade(30);
        pes3.setSexo("F");
        pes3.setSalario(3600.90);
        System.out.println(pes3.toString());
        System.out.println();

        pes4.setNome("Roseane");
        pes4.setIdade(33);
        pes4.setSexo("F");
        pes4.setSetor("Secretaria");
        System.out.println(pes4.toString());

    }
}
