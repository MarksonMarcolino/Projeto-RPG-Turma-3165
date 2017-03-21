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
public class CapuzDePano extends Equipamento{
    public void mudancavalorvenda(int valorcompra){
        this.setValorVenda((int) (valorcompra*0.5));
    }
    public CapuzDePano(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra); 
         this.setDefesa(1);
         this.setDefesaMagica(1);
         this.setDescricao("Capuz muito utilizado por goblins");
         this.setNome("CapuzDePano");
         this.setPeso(1);
         this.setValorCompra(90);
         this.setValorVenda(45);
         this.setLvlm(2);
    }
    
}
