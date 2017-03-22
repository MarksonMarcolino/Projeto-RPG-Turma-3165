
package br.com.satc.equipamentos;


public class BotasDoGiganteBaloso extends Equipamento{
    private int vitalidade;
    private int lvl;
    
    public int getLvl(){
        return lvl;
    }
    
    public void setLvl(int lvl){
       this.lvl = lvl;
    }
            
    public BotasDoGiganteBaloso(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        
      this.setNome("BotasDoGiganteBaloso");
      this.setDescricao("Forjado pelo grandioso mestre baloso, Orc das montanhas de nevada, as botas foram feitas para"
        + "ajudar nas piores batalhas, contra os piores inimigos. Assim, dando ao mestre das botas, uma forca imensuravel" );
      this.setDefesa(2);
      this.setDefesaMagica(0);
      this.setValorVenda(21);
      this.setValorCompra(42);
      this.setPeso(1);
      this.setVitalidade(1);
      this.setLvl(1);
    }

   
    public int getVitalidade() {
        return vitalidade;
    }

    
    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    
    
    
}
