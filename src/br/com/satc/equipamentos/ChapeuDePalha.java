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
public class ChapeuDePalha extends Equipamento{
  

     public void mudancavalorvenda(int valorcompra){
        this.setValorVenda((int) (valorcompra*0.5));
    }
    public ChapeuDePalha(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setDefesa(1);
        this.setDefesaMagica(0);
        this.setDescricao("Chapéu para iniciantes!");
        this.setNome("ChapéuDePalha"
                + "");
        this.setPeso(1);
        this.setValorCompra(10);
        this.setValorVenda(5);
        this.setLvlm(1);
    }
    
}
