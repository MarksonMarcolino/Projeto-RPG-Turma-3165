/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.equipamentos;

/**
 *
 * @author Edutec
 */
public class ArmaduraDeEspinhos extends Equipamento{
    
    private float danoRepelido;//Repele o dano
    private int nivelMinimo;
    private double retornaDano;
    public ArmaduraDeEspinhos(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setDefesa(5);
        this.setDefesaMagica(2);
        this.setDescricao("Após uma terrivel guerra, no meio de uma multidão surge um titan. Em meio todo o caos, "
                + "tantas mortes e tantos gritos lá está ele matando a todos que ousam o desafiar. Surge um guerreiro, "
                + "meio humano, meio aquático, nunca visto antes, mas seu nome era muito conhecido. Coral's, "
                + "o guerreiro mais furioso e mais destemido de todos. Disposto a lutar bravamente com o titan. "
                + "Após muita pancadaria, Coral's morto de fome come o titan, porém ali mesmo, "
                + "titan e Coral's morrem, pois o titan o perfura por dentro mas coral o digere inteiro. "
                + "Sua carcaça, se transformou em uma amradura, pois Coral's jurou proteger aquele povo até o fim dos tempos,"
                + "e é gaurdada até hoje e é um dos artefatos mais poderosos do mundo, capaz de repelir o dano inimigo.");
        this.setNome("Armadura de espinhos");
        this.setPeso(30);
        this.setValorCompra(500);
        this.setValorVenda(250);
        this.setDanoRepelido(0.05f);
        this.setNivelMinimo(15);
    }

    public float getDanoRepelido() {
        return danoRepelido;
    }

    public void setDanoRepelido(float DanoRepelido) {
        this.danoRepelido = DanoRepelido;
    }

    public int getNivelMinimo() {
        return nivelMinimo;
    }

    public void setNivelMinimo(int NivelMinimo) {
        this.nivelMinimo = NivelMinimo;
    }

    public double getRetornaDano() {
        return retornaDano;
    }

    public void setRetornaDano(double RetornaDano) {
        this.retornaDano = RetornaDano;
    }
    /*public void setRetornaDano(double RetornaDano) {
        this.RetornaDano = DanoRepelido;
    }*/
     
    
}
