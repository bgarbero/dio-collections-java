package main.java.set.pesquisa.listadetarefas;

public class Tarefa {
    private String descricao;
    private boolean conclusao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.conclusao = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public String toString() {
        return "Tarefa{" + descricao +
                ", " + conclusao +
                '}';
    }
}
