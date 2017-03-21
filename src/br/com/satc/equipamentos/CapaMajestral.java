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
public class CapaMajestral extends Equipamento{
    private int inteligencia;
    private int destreza;
    private int sorte;
    private int agilidade;
    private int nvlmin;
    public CapaMajestral(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setAgilidade(3);
        this.setSorte(4);
        this.setInteligencia(5);
        this.setDestreza(4);
        this.setDefesa(3);
        this.setDefesaMagica(3);
        this.setPeso(3);
        this.setNome("Capa Majestral");
        this.setValorCompra(7550);
        this.setValorVenda(6550);
        this.setDescricao("");
        this.setNvlmin(14);
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getNvlmin() {
        return nvlmin;
    }

    public void setNvlmin(int nvlmin) {
        this.nvlmin = nvlmin;
    }
    
}
