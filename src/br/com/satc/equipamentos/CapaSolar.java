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
public class CapaSolar extends Equipamento{
    private int dano;
    private int danocritico;
    public CapaSolar(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra, int nvlmin) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra, nvlmin);
        this.setDano(2);
        this.setDanocritico(2);
        this.setDefesa(5);
        this.setDefesaMagica(3);
        this.setPeso(4);
        this.setNome("Capa Solar");
        this.setValorCompra(6550);
        this.setValorVenda(5550);
        this.setDescricao("Capa forjada no vulcão mais quente de todo reino para ter um defesa surreal.");
        this.setNvlmin(11);
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDanocritico() {
        return danocritico;
    }

    public void setDanocritico(int danocritico) {
        this.danocritico = danocritico;
    }
    
}
