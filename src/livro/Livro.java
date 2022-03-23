package livro;

public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" +
                "Título:'" + titulo + '\'' +
                ",\nAutor: '" + autor + '\'' +
                ",\nTotal de paginas: " + totPaginas +
                ", página tual:" + paginaAtual +
                ", \nAberto: " + aberto +
                ",\nLeitor:" + leitor.getNome() +
                " que tem " + leitor.getIdade() +
                " anos de idade, e é do sexo "  + leitor.getSexo() +
                '}';
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pag) {
        if (pag > totPaginas){
            this.paginaAtual = 0;
        }else {
            this.paginaAtual = pag;
        }
    }

    @Override
    public void avancarPag() {
        this.paginaAtual++;
    }

    @Override
    public void voltarPag() {
        this.paginaAtual--;
    }
}
