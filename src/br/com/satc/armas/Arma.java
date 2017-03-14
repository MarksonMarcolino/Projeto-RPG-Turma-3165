package br.com.satc.armas;
public abstract class Arma {
    private String desc, nome;
    private int dano, alcance, up, precisao;

    
    public Arma(String desc, String nome, int dano, int alcance, int up,int precisao){
          this.setAlcance(alcance);
          this.setDano(dano);
          this.setDesc(desc);
          this.setNome(nome);
          this.setPrecisao(precisao);
          this.setUp(up);
        
    }
    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dano
     */
    public int getDano() {
        return dano;
    }

    /**
     * @param dano the dano to set
     */
    public void setDano(int dano) {
        this.dano = dano;
    }

    /**
     * @return the alcance
     */
    public int getAlcance() {
        return alcance;
    }

    /**
     * @param alcance the alcance to set
     */
    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    /**
     * @return the up
     */
    public int getUp() {
        return up;
    }

    /**
     * @param up the up to set
     */
    public void setUp(int up) {
        this.up = up;
    }

    /**
     * @return the precisa
     */
    public int getPrecisao() {
        return precisao;
    }

    /**
     * @param precisa the precisa to set
     */
    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }
    
}
