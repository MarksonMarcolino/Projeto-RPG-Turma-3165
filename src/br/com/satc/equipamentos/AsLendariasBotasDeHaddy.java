
package br.com.satc.equipamentos;


public class AsLendariasBotasDeHaddy extends Equipamento {
    
    private int agilidade;
    private int sorte;
    private int vitalidade;
    private int lvl;
    
    public AsLendariasBotasDeHaddy(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
      
      this.setNome("AsLendariasBotasDeHaddy");
      this.setDescricao("THE LEGEND."
        + "" );
      this.setDefesa(6);
      this.setDefesaMagica(2);
      this.setValorVenda(1100);
      this.setValorCompra(550);
      this.setPeso(6);
      this.setLvl(15);
      this.setVitalidade(9);
      this.setSorte(3);
      this.setAgilidade(3);
    }

   
    public int getAgilidade() {
        return agilidade;
    }

    
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    
    public int getSorte() {
        return sorte;
    }

    /**
     * @param sorte the sorte to set
     */
    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    
    public int getVitalidade() {
        return vitalidade;
    }

    
    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    
    public int getLvl() {
        return lvl;
    }

    
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
}
