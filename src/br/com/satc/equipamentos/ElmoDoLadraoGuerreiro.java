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
public class ElmoDoLadraoGuerreiro extends Equipamento{
    private int pontocritico;
    private int vitalidade;
    private int lvlm;
    public ElmoDoLadraoGuerreiro(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setPontocritico(5);
        this.setDefesa(3);
        this.setDefesaMagica(2);
        this.setDescricao("Forjado pela mais renomada ferraria do mundo o Elmo Do Ladrão Guerreiro foi utilizado"
                + " por um dos maiores líderes guerreiros da hitória, que com sorte e um belo elmo consegiu reverter"
                + " a invasão do reino vizinho, que matara quase todo o seu exército, mas que esqueçeu do grandioso"
                + " líder que enfrentava e do fato de que o mesmo conhecia como ninguém as entradas e saídas de seu país,"
                + " perdendo assim , em pequenas porções, o seu exército até com que ele virasse pó ");
        this.setNome("Elmo Do Ladrão Guerreiro");
        this.setPeso(3);
        this.setValorCompra(12000);
        this.setValorVenda(12000);
        this.setVitalidade(3);
        this.setLvlm(15);
    }

    public int getPontocritico() {
        return pontocritico;
    }

    public void setPontocritico(int pontocritico) {
        this.pontocritico = pontocritico;
    }


    @Override
    public void setDefesa(int defesa) {
        super.setDefesa(defesa); //To change body of generated methods, choose Tools | Templates.
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getLvlm() {
        return lvlm;
    }

    public void setLvlm(int lvlm) {
        this.lvlm = lvlm;
    }

}
