/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.armas;

/**
 *
 * @author Edutec
 */
public class AFaquinha extends Arma implements IaFaquinha {
    
    private int afiado;
    private int turno;
    
    public AFaquinha(String desc, String nome, int dano, int alcance, int up, int nivel, float valor, float valorC, float valorV) {
        super(desc, nome, dano, alcance, up, nivel, valorC, valorV);
        this.setAfiado(5);
        this.setAlcance(5);
        this.setDesc("Esta faca foi forjada com o unico propósito de CORTAR CARNE, tão afiada quanto as garas de um gato"
                + " e tão dicreta quanto um camaleão.");
        this.setNome("A faquinha");
        this.setDano(7);
        this.setTurno(2);
        this.setNivel(1);
        this.setValorC(400);
        this.setValorV(200);
        
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
    public void UpFaquinha() {
        this.setUp(this.getUp() + 1);
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
