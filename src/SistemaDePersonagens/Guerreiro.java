package SistemaDePersonagens;
public  class Guerreiro  extends Personagem{

    @Override
    public void habilidades() {
        System.out.println("O seu guerreiro usou a habilidade dele ");
    }
    private int forca;

    public Guerreiro(String nome, int forca) {
        super(nome);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }
    public void forcaPropria(int poder){
        this.forca = this.forca + poder;
        if (this.forca <= 100){
            System.out.println(" Força atual " + this.forca);
        }else{
            this.forca = 100;
            System.out.println(" força atual " + this.forca);
        }
    }
}
