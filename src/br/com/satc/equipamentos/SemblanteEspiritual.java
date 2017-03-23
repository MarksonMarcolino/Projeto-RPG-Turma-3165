package br.com.satc.equipamentos;

public class SemblanteEspiritual extends Equipamento {

    private float RegenarVida;
    private int NivelMinimo;
    private int RegeneradorDeVida;

    public SemblanteEspiritual(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setDefesa(1);
        this.setDefesaMagica(3);
        this.setPeso(25);
        this.setDescricao("Forjada apartir da alma dos magos, que se sacrificaram para proteger seu povo, ela aparece a todos"
                + "os magos poderosos com um objetivo puro no coração, o de defender o bem e lutar contra o mal.");
        this.setNome("Semblante Espiritual");
        this.setValorCompra(700);
        this.setValorVenda(350);
        this.setRegenarVida(10);
        this.setNivelMinimo(15);
    }

    public float getRegenarVida() {
        return RegenarVida;
    }

    public void setRegenarVida(float RegenarVida) {
        this.RegenarVida = RegenarVida;
    }

    public int getNivelMinimo() {
        return NivelMinimo;
    }

    public void setNivelMinimo(int NivelMinimo) {
        this.NivelMinimo = NivelMinimo;
    }

    public int getRegeneradorDeVida() {
        return RegeneradorDeVida;
    }

    public void setRegeneradorDeVida(int RegeneradorDeVida) {
        this.RegeneradorDeVida = RegeneradorDeVida;
    }

}
