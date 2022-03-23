package lutadores_ufc;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Luta {

    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Publicos
    void marcarLuta(@NotNull Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // Resultados 0, 1 ou 2
            System.out.println("====== RESULTADO DA LUTA ======");
            switch (vencedor){
                case 0: // Desafiante vence
                    System.out.println("O desafiante " + this.desafiante.getNome()
                    + "venceu!!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;

                case 1: // Desafiado vence
                    System.out.println("O desafiado " + this.desafiado.getNome()
                            + "venceu!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();

                    break;
                case 2: // Empate
                    System.out.println("A luta terminou empatada!!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
            }

        }else {
            System.out.println("A luta não pode acontecer!");
        }
        System.out.println("===============================");
    }
    //Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
