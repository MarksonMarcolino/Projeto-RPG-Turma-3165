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
public abstract class CapusBelicoDoNorte extends Equipamento{
    private int inteligencia;
    

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
     public void mudancavalorvenda(int valorcompra){
        this.setValorVenda((int) (valorcompra*0.5));
    }
  
    public CapusBelicoDoNorte(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
       this.setDefesa(2);
       this.setDefesaMagica(2);
       this.setDescricao("O majestoso CapusBélicoDoNorte, é um artefato de guerra muito pouco conhecido,"
               + " até mesmo porque a maioria dos que o conheceram não conseguiram sair vivos do confronto.");
       this.setNome("CapusBélicoDoNorte");
       this.setPeso(2);
       this.setValorCompra(590);
       this.setValorVenda(390);
       this.setInteligencia(2);
       this.setLvlm(8);
    }
    
}
