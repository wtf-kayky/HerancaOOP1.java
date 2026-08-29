package SistemaDePersonagens;
public abstract class Personagem {

    private String nome;
    private int nivel;
    private int vida;
    private int experiencia;


    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.vida = 100;
        this.experiencia = 0;
    }



    public int getVida() {
        return vida;
    }



    public int getNivel() {
        return nivel;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void receberDano(int dano){
        this.vida = this.vida - dano;
        if (this.vida > 0 ){
            System.out.println("Vida atual " + this.vida);
        }
        if (this.vida <= 0){
            this.vida = 0;
            System.out.println("Vida atual: " + this.vida);

        }
    }
    public void receberCura(int cura) {

        this.vida = this.vida + cura;
        if (this.vida > 100){
            this.vida = 100;
            System.out.println(" Vida atual " + this.vida);
        }
    }

    public void Ganharxp(int xp){
        this.experiencia = experiencia + xp;
        if (experiencia >= 100){
            this.nivel++;
            System.out.println(" nivel atual " + nivel);
            experiencia = 0;
        }
    }
    public void Status(){
        System.out.println("Nome" + this.nome +"\n" + "Vida" + this.vida + "\n" + "Nivel" + this.nivel);
    }
    public abstract void habilidades();
}
