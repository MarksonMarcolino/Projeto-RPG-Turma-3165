package br.com.satc.equipamentos;

public class ArmaduraLeve extends Equipamento {

    private float absorveDano;
    private float danoAbsorvido;
    private int nivelMinimo;

    public ArmaduraLeve(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setDefesa(2);
        this.setDefesaMagica(1);
        this.setPeso(10);
        this.setDescricao("Em uma floresta tão distante, onde a paz reinava, zeus e seus irmãos estavam brigados e ali resolvem"
                + "acertar suas contas. No meio desse 'acerto', a floresta era dizimida, e junto com ela todos os animais"
                + "ali presentes. Então eis que do nada surge uma nuvem preta, e desaparece como um raio negro, ousando"
                + "desafiar zeus e seus irmãos. A batalha é travada, porém fora da floresta, a pluma, como era chamada a nuvem"
                + "preta que defendia os animais, havia se tracando com zeus e seus irmãos em um lugar no espaço, onde até os"
                + "dias de hoje lutam um contra si, podendo ouvir essa luta atráves dos raios e trovões que caem aqui na terra.");
        this.setNome("Armadura de pluma");
        this.setValorVenda(50);
        this.setValorCompra(100);
        this.setAbsorveDano(0.05f);
        this.setNivelMinimo(0);
    }

    public float getAbsorveDano() {
        return absorveDano;
    }

    public void setAbsorveDano(float AbsorveDano) {
        this.absorveDano = AbsorveDano;
    }

    public float getDanoAbsorvido() {
        return danoAbsorvido;
    }

    public void setDanoAbsorvido(float DanoAbsorvido) {
        this.danoAbsorvido = DanoAbsorvido;
    }

    public int getNivelMinimo() {
        return nivelMinimo;
    }

    public void setNivelMinimo(int NivelMinimo) {
        this.nivelMinimo = NivelMinimo;
    }

}
