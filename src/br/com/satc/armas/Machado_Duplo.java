package br.com.satc.armas;
public class Machado_Duplo extends Arma implements IMachado_Duplo {
    private int afiado;
    private float peso;
       
    public Machado_Duplo(String desc, String nome, int dano, int alcance, int up, int precisao) {
        super(desc, nome, dano, alcance, up, precisao);
        this.setAfiado(2);
        this.setAlcance(2);
        this.setDano(ESPERAR O DALTON);
        this.setDesc("O Machado Duplo é uma arma branca, disponível no nivel 10 ao 15, produzido por um ferreiro, forjada com fogo.");
        this.setNome("Machado²");
        this.setPrecisao(8);
        this.setPeso(peso);
    }

    /**
     * @return the afiado
     */
    public int getAfiado() {
        return afiado;
    }

    /**
     * @param afiado the afiado to set
     */
    public void setAfiado(int afiado) {
        this.afiado = afiado;
    }

    @Override
    public void UpMachado() {
        this.setUp((this.getUp() + ESPERAR O DALTON));
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
