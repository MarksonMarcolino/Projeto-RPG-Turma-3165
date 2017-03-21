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
public class CapaGalante extends Equipamento{
    private int dano;
    private int agilidade;
    private int danocritico;
    private int nvlmin;
    public CapaGalante(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setAgilidade(2);
        this.setDano(4);
        this.setDanocritico(3);
        this.setDefesa(2);
        this.setDefesaMagica(2);
        this.setPeso(2);
        this.setNome("Capa Galante");
        this.setValorCompra(4550);
        this.setValorVenda(3550);
        this.setDescricao("Usada pelo guerreiro mais galante de todo o reino.");
        this.setNvlmin(9);
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

    public int getNvlmin() {
        return nvlmin;
    }

    public void setNvlmin(int nvlmin) {
        this.nvlmin = nvlmin;
    }
    
}
