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
public class Capadepalha extends Equipamento{
    private int vitalidade;
    public Capadepalha(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra, int nvlmin) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra, nvlmin);
        this.setVitalidade(1);
        this.setDefesa(1);
        this.setDefesaMagica(0);
        this.setPeso(1);
        this.setNome("Capa de Palha");
        this.setValorCompra(200);
        this.setValorVenda(100);
        this.setDescricao("Capa inicial.");
        this.setLvl(1);
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }
}
