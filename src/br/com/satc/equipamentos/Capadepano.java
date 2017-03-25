/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.equipamentos;

/**
 *
 * @author user
 */
public class Capadepano extends Equipamento{
    private int dano;
    private int vitalidade;
    public Capadepano(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra, int nvlmin) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra, nvlmin);
        this.setVitalidade(1);
        this.setDano(1);
        this.setDefesa(0);
        this.setDefesaMagica(0);
        this.setPeso(1);
        this.setNome("Capa de Pano");
        this.setValorCompra(400);
        this.setValorVenda(200);
        this.setDescricao("Capa inicial.");
        this.setLvl(1);
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }
}
