package livro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] pes = new Pessoa[2];
        Livro[] liv = new Livro[3];

        pes[0] = new Pessoa("João", 25, "M");
        pes[1] = new Pessoa("Bia", 28, "M");

        liv[0] = new Livro("Aprendendo Java", "Leonei Gomes",148, pes[0] );
        liv[1] = new Livro("Algorítmo", "Liliane Santana", 230, pes[0]);
        liv[2] = new Livro("Java POO", "José da Silva", 300, pes[1]);

        liv[0].abrir();
        liv[0].folhear(20);
        System.out.println(liv[0].detalhes());
        liv[1].abrir();
        System.out.println(liv[1].detalhes());

    }
}
