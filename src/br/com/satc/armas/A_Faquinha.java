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
public class A_Faquinha extends Arma implements IA_Faquinha {
    
    private int afiado;
    private int versatilidade;
    private int quantidade;
    
    public A_Faquinha(String desc, String nome, int dano, int alcance, int up, int precisao) {
        super(desc, nome, dano, alcance, up, precisao);
        this.setAfiado(5);
        this.setVersatilidade(4);
        this.setAlcance(5);
        this.setDesc(desc);
        this.setNome("A faquinha");
        this.setPrecisao(9);
        this.setQuantidade(4);
        this.setVersatilidade(8);
        
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

    /**
     * @return the versatilidade
     */
    public int getVersatilidade() {
        return versatilidade;
    }

    /**
     * @param versatilidade the versatilidade to set
     */
    public void setVersatilidade(int versatilidade) {
        this.versatilidade = versatilidade;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void UpFaquinha() {
        this.setUp(this.getUp() + 1);
    }
    
    
}
