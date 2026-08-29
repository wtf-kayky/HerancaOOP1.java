package SistemaDePersonagens;

public class AcoesDosPersonagens {
    public static void main(String[] args) {

        Guerreiro guerreiros = new Guerreiro("kayke", 100);

        guerreiros.Status();
        guerreiros.receberDano(30);
        guerreiros.Status();
        guerreiros.receberCura(20);
        guerreiros.Status();
        guerreiros.Ganharxp(100);
        guerreiros.Status();

        Mago mago = new Mago("Merlim");

        mago.Status();
        mago.receberDano(40);
        mago.receberCura(20);
        mago.habilidades();
        mago.getMana();
        mago.recuperarMana(20);
        mago.habilidades();
    }
}
