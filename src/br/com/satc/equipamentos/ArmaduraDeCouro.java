package br.com.satc.equipamentos;

public class ArmaduraDeCouro extends Equipamento {

    private float vidaAdcional;
    private int nivelMinino;
    private int nivel;

    public ArmaduraDeCouro(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setDefesa(2);
        this.setDefesaMagica(0);
        this.setPeso(20);
        this.setDescricao("Criada apartir da pele dos guerreiros mais destemidos, essa armadura só pode ser usada por"
                + "guerreiros desbravados e com um enorme coração.");
        this.setNome("Armadura de couro");
        this.setValorCompra(75);
        this.setValorVenda(37);
        this.setVidaAdcional(15);
        this.setNivelMinino(0);
    }

    public float getVidaAdcional() {
        return vidaAdcional;
    }

    public void setVidaAdcional(float VidaAdcional) {
        this.vidaAdcional = VidaAdcional + nivel;
    }

    public int getNivelMinino() {
        return nivelMinino;
    }

    public void setNivelMinino(int NivelMinino) {
        this.nivelMinino = NivelMinino;
    }

}
