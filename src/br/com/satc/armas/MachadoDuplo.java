package br.com.satc.armas;

public class MachadoDuplo extends Arma implements IMachadoDuplo {

    private int afiado;
    private float peso;
    private int turno;

    public MachadoDuplo(String desc, String nome, int dano, int alcance, int up, int nivel, float valor, float valorC, float valorV) {
        super(desc, nome, dano, alcance, up, nivel, valorC, valorV);
        this.setAfiado(4);
        this.setAlcance(2);
        this.setDano(15);
        this.setDesc("O Machado Duplo é uma arma branca, disponível no nivel 10 ao 15, produzido por um ferreiro, forjada com fogo.");
        this.setNome("Machado²");
        this.setPeso(8);
        this.setTurno(1);
        this.setNivel(10);
        this.setValorC(1000);
        this.setValorV(500);
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
        this.setUp((this.getUp() + 1));
        this.setDano(this.getDano() + 1);
        this.setAlcance(this.getAlcance() + 1);
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

    /**
     * @return the turno
     */
    public int getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

}
