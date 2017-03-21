package br.com.satc.equipamentos;

public class MantoAnulaMagia extends Equipamento {

    private float anulaMagia;//Aumenta resistencia mágica ainda mais
    private float anuladorDeMagia;
    private int nivelMinino;

    public MantoAnulaMagia(int defesa, int defesaMagica, int peso, String descricao, String nome, int valorVenda, int valorCompra) {
        super(defesa, defesaMagica, peso, descricao, nome, valorVenda, valorCompra);
        this.setDefesa(0);
        this.setDefesaMagica(4);
        this.setPeso(15);
        this.setDescricao("Essa capa foi criada por um camponês que queria proteger sua filha das garras de uma malvada bruxa"
                + "que queria ser a mais bela de todas e trasformava qualquer um em algo feio e pavoroso. Com a construção"
                + "dessa capa, o tal camponês conseguiu proteger sua filha das garras da bruxa que ficou irada e acabou"
                + "destrunido a tudo e a todos, inclusive a ela. Porém além de não transformar sua filha, ela não sofreu efeito"
                + "da destruição causada pela bruxa, porém sua capa sumiu e pelos relatos só aparece aos guerreiros "
                + "mais valentes.");
        this.setNome("Capa Mágica");
        this.setValorCompra(100);
        this.setValorVenda(50);
        this.setAnulaMagia(2);
        this.setNivelMinino(0);
    }

    public float getAnulaMagia() {
        return anulaMagia;
    }

    public void setAnulaMagia(float AnulaMagia) {
        this.anulaMagia = AnulaMagia;
    }

    public float getAnuladorDeMagia() {
        return anuladorDeMagia;
    }

    public void setAnuladorDeMagia(float AnuladorDeMagia) {
        this.anuladorDeMagia = AnuladorDeMagia;
    }

    public int getNivelMinino() {
        return nivelMinino;
    }

    public void setNivelMinino(int NivelMinino) {
        this.nivelMinino = NivelMinino;
    }

}
