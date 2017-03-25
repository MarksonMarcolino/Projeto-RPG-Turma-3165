/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.equipamentos;

/**
 *
 * @author Markson
 */
public abstract class Equipamento {
    private int defesa;
    private int defesaMagica;
    private int peso;
    private String descricao;
    private String nome;
    private int valorVenda;
    private int valorCompra;
    private int lvl;

        public Equipamento(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra, int nvlmin) {
        this.defesa = defesa;
        this.defesaMagica = defesaMagica;
        this.peso = peso;
        this.descricao = descricao;
        this.nome = nome;
        this.valorVenda = valorVenda;
        this.valorCompra = valorCompra;
        this.lvl = lvl;
    }

    public int getDefesa() {
        return defesa;
    }

    /**
     * @param defesa the defesa to set
     */
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    /**
     * @return the defesaMagica
     */
    public int getDefesaMagica() {
        return defesaMagica;
    }

    /**
     * @param defesaMagica the defesaMagica to set
     */
    public void setDefesaMagica(int defesaMagica) {
        this.defesaMagica = defesaMagica;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
     * @return the valorVenda
     */
    public int getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(int valorVenda) {
        this.valorVenda = valorVenda;
    }

    /**
     * @return the valorCompra
     */
    public int getValorCompra() {
        return valorCompra;
    }

    /**
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
            
            
    
}
