
package br.com.satc.equipamentos;


public class BotasDeErronio extends Equipamento {
   
    private int sorte;
    private int vitalidade;
    private int lvl;
    
    public BotasDeErronio(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
      
      this.setNome("BotasDeErronio");
      this.setDescricao("A bota mais errada já feita. Dizem as lendas que ela continua errada."
        + "" );
      this.setDefesa(4);
      this.setDefesaMagica(1);
      this.setValorVenda(270);
      this.setValorCompra(130);
      this.setPeso(4);
      this.setLvl(5);
      this.setVitalidade(4);
      this.setSorte(-1); // Em outra aula, era bom todos da parte de "Equipamentos" se reunir e falar sobre os atributos de maneira em que todos cheguem em um consenso.
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

    /**
     * @return the sorte
     */
    public int getSorte() {
        return sorte;
    }

    /**
     * @param sorte the sorte to set
     */
    public void setSorte(int sorte) {
        this.sorte = sorte;
    }
    
}
