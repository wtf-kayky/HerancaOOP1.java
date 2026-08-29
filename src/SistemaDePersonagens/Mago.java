package SistemaDePersonagens;

public class Mago extends Personagem {
    @Override
    public void habilidades() {

        if (this.mana >= 20) {
            System.out.println("O mago usou a sua magia ");
            this.mana = this.mana - 20;
        } else {
            System.out.println(" Mana isuficiente para o mago usar magia ");
        }
    }

    public int getMana() {
        return mana;
    }

    private int mana;

    public Mago(String nome) {
        super(nome);
        this.mana = 100;
    }


    public void recuperarMana(int recuperacaoDeMana) {

        if (recuperacaoDeMana <= 0) {

            System.out.println("Mana isuficiente: " + this.mana);

        } else {

            this.mana = this.mana + recuperacaoDeMana;

            if (this.mana > 100) {
                this.mana = 100;
                System.out.println("Mana reestaurada ao maximo " + this.mana);

            } else {
                System.out.println("Mana recuperada " + this.mana);
            }
        }
    }
}
//
