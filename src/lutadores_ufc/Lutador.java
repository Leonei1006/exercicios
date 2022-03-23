package lutadores_ufc;

public class Lutador {

        //Atributos
        private String nome;
        private String nacionalidade;
        private int idade;
        private double altura;
        private double peso;
        private String categoria;
        private int vitorias;
        private int derrotas;
        private int empates;


    // Métodos Públicos
    public void apresentar(){
        System.out.println("--------------------");
        System.out.println("AGORA É A HORA DA VERDADE!! " +
                "O MOMENTO QUE TODOS ESTÁVAMOS ESPERANDO!!");
        System.out.println("LÁ VEM ELE, A BESTA ENJAULADA, E O NOME DE É " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("No auge dos seus " + this.getIdade() + " anos.");
        System.out.println("Pesando " + this.getPeso() + "Kg.");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getEmpates() + " empates e");
        System.out.println(this.getDerrotas() + " derrotas");

    }
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou  " + this.getVitorias() + " lutas");
        System.out.println("Com apenas " + this.getDerrotas() + " derrotas");
        System.out.println("Empatou " + this.getEmpates() + " vezes " );
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
        //this.vitorias = this.vitorias + 1; *Ambas as opções são válidas
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
        // Construtor
    public Lutador() {
        this.nome = "";
        this.nacionalidade = "";
        this.idade = 0;
        this.altura = 0;
        this.setPeso(peso);
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }

      // Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 51){
            this.categoria = "Categoria Inválida";
        }else if(this.peso <= 71){
            this.categoria = " Leve";
        }else if (this.peso <= 95){
            this.categoria = " Médio";
        }else if (this.peso <= 125){
            this.categoria = " Pesado";
        }else {
            this.categoria ="Categoria Inválida!";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
