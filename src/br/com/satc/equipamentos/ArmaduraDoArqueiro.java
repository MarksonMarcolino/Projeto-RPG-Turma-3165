package br.com.satc.equipamentos;

public class ArmaduraDoArqueiro extends Equipamento {

    private int inteligencia;
    private int nivelMinimo;
    private int destreza;
    private int agilidade;

    public ArmaduraDoArqueiro(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setDefesa(1);
        this.setDefesaMagica(1);
        this.setPeso(10);
        this.setDescricao("Armadura forjada a partir da pele dos oráculos, destinada apenas a quem possui inteligencia para"
                + "combate, mesmo parecendo frágil, ela te da muita inteligência. O bastante para derrtotar alguém"
                + "5 vezes maior que você");
        this.setNome("Armadura Inteligente");
        this.setValorCompra(500);
        this.setValorVenda(250);
        this.setInteligencia(5);
        this.setDestreza(5);
        this.setAgilidade(5);
        this.setNivelMinimo(15);
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int Inteligencia) {
        this.inteligencia = Inteligencia;
    }

    public int getNivelMinimo() {
        return nivelMinimo;
    }

    public void setNivelMinimo(int NivelMinimo) {
        this.nivelMinimo = NivelMinimo;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

}
