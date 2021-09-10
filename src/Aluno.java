public class Aluno {
    // Atributos da classe Aluno
    private int numero;
    private float altura;

    // Construtor padrão da classe Aluno
    public Aluno() {
        this.setNumero(0);
        this.setAltura(0);
    }

    // Construtor com dados do Aluno
    public Aluno(int numero, float altura) {
        this.setNumero(numero);
        this.setAltura(altura);
    }

    // Getters e setters dos atributos da classe Aluno
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
