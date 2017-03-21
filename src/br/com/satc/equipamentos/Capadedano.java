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
public class Capadedano extends Equipamento{
    private int dano;
    private int agilidade;
    private int danocritico;
    public Capadedano(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra, int nvlmin) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra, nvlmin);
        this.setAgilidade(1);
        this.setDano(4);
        this.setDanocritico(3);
        this.setDefesa(3);
        this.setDefesaMagica(1);
        this.setPeso(3);
        this.setNome("Capa de Dano");
        this.setValorCompra(4000);
        this.setValorVenda(2000);
        this.setDescricao("Capa feita do couro de um touro forte portanto quem a usala terá a sua força.");
        this.setNvlmin(10);
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getDanocritico() {
        return danocritico;
    }

    public void setDanocritico(int danocritico) {
        this.danocritico = danocritico;
    }  
}
