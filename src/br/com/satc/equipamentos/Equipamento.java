
package br.com.satc.equipamentos;


public abstract class Equipamento {
    private int defesa;
    private int defesaMagica;
    private int peso;
    private String descricao;
    private String nome;
    private int valorVenda;
    private int valorCompra;

    public Equipamento(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra){
       this.setDefesa(defesa);
       this.setDefesaMagica(defesaMagica);
       this.setDescricao(descricao);
       this.setNome(nome);
       this.setPeso(peso);
       this.setValorCompra(valorCompra);
       this.setValorVenda(valorVenda);
      
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
    
            
            
    
}
