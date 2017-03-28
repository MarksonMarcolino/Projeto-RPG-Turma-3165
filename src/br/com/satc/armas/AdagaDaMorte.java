/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.armas;

/**
 *
 * @author diego
 */
public class AdagaDaMorte extends Arma implements IAdagaDaMorte{
    private int afiado;
    private int turno;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    private float peso;

 

 

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

   public AdagaDaMorte(String desc, String nome, int dano, int up, int nivel, float valor,  float valorC, float valorV) {
        super(desc, nome, dano, up, nivel, valorC, valorV);
        this.setAfiado(5);
        this.setDesc("Uma adaga forjada com aço puro no fogo de um dragão");
        this.setNome("Adaga da morte");
        this.setDano(10);
        this.setTurno(1);
        this.setPeso(3);
        this.setValorC(800);
        this.setValorV(400);
    }

    public int getAfiado() {
        return afiado;
    }

    public void setAfiado(int afiado) {
        this.afiado = afiado;
    }



    @Override
    public void uparma() {
        //upa a arma
        this.setUp(this.getUp() + 1);
        this.setDano(this.getDano() + 1);
        this.setAlcance(this.getAlcance() + 1);
    }    
}