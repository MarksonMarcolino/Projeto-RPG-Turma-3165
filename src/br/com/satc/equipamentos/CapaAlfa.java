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
public class CapaAlfa extends Equipamento{
    private int destreza;
    private int agilidade;
    private int nvlmin;
    public CapaAlfa(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setAgilidade(4);
        this.setDestreza(2);
        this.setDefesa(2);
        this.setDefesaMagica(3);
        this.setPeso(2);
        this.setNome("Capa Alfa");
        this.setValorCompra(3550);
        this.setValorVenda(2550);
        this.setDescricao("Feito da pele de um Lobo Alfa em uma das montanhas mais geladas do reino.");
        this.setNvlmin(8);
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
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
