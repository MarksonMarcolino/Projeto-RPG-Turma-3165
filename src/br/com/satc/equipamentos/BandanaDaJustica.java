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
public class BandanaDaJustica extends Equipamento{
    
    public void mudancavalorvenda(int valorcompra){
        this.setValorVenda((int) (valorcompra*0.5));
    }
    public BandanaDaJustica(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setDefesa(2);
        this.setDefesaMagica(2);
        this.setDescricao("A bandana mais famosa entre os novos aventureiros");
        this.setNome("BandanaDaJustiça");
        this.setPeso(1);
        this.setValorCompra(200);
        this.setValorVenda(100);
        this.setLvlm(5);
    }
    
}
