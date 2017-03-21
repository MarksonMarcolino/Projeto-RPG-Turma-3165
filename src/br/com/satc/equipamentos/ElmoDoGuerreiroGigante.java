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
public  abstract class ElmoDoGuerreiroGigante extends Equipamento{
    private int viltalidade;
    
    public void mudancavalorvenda(int valorcompra){
        this.setValorVenda((int) (valorcompra*0.5));
    }
 
    public ElmoDoGuerreiroGigante(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        
        this.setDefesa(3);
        this.setDefesaMagica(0);
        this.setDescricao("O esplendoroso gigante guerreiro após longas batalhas, no norte de seu continente,"
                + "morre e deixa seu legado com um belíssimo elmo que é almeijado por guerreiros de todo o mundo!");
        this.setNome("ElmoDoGuerreiroGigante");
        this.setPeso(2);
        this.setValorCompra(270);
        this.setValorVenda(135);
        this.setViltalidade(2);
        this.setLvlm(6);
    }

    public int getViltalidade() {
        return viltalidade;
    }

    public void setViltalidade(int viltalidade) {
        this.viltalidade = viltalidade;
    }
}
