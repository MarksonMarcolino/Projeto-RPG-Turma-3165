package br.com.satc.armas;
public abstract class Arma {
    private String desc, nome;
    private int dano, alcance, up, nivel;
    private float valorC, valorV;

    
    public Arma(String desc, String nome, int dano, int alcance, int up, int nivel, float valorC, float valorV){
          this.setAlcance(alcance);
          this.setDano(dano);
          this.setDesc(desc);
          this.setNome(nome);
          this.setUp(up);
          this.setNivel(nivel);
          this.setValorC(valorC);
          this.setValorV(valorV);
    }

    public float getValorC() {
        return valorC;
    }

    public void setValorC(float valorC) {
        this.valorC = valorC;
    }

    public float getValorV() {
        return valorV;
    }

    public void setValorV(float valorV) {
        this.valorV = valorV;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

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

    }
    
