package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Pokemon implements Cloneable {
    private String nome;
    private String tipo;
    private Moves moves;
    private Integer bst;
    private int level;


    public Pokemon(String nome, String tipo, Moves moves, Integer bst, int level){
        this.nome = nome;
        this.tipo = tipo;
        this.moves = moves;
        this.bst = bst;
        this.level = level;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Moves getMoves() {
        return moves;
    }

    public void setMoves(Moves moves) {
        this.moves = moves;
    }

    public Integer getBst() {
        return bst;
    }

    public void setBst(Integer bst) {
        this.bst = bst;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public Pokemon clone() throws CloneNotSupportedException{
        Pokemon pokeClone = (Pokemon) super.clone();
        pokeClone.moves = (Moves) pokeClone.moves.clone();
        return pokeClone;
    }

    @Override
    public String toString(){
        return "Pokemon{" +
                ", nome='" + nome + '\'' +
                ", moves=" + moves +
                ", tipo='" + tipo + '\'' +
                ", BST='" + bst + '\'' +
                ", Level='" + level + '\'' +
                '}';
    }
}