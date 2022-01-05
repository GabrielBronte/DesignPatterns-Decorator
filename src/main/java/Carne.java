public class Carne implements Hamburguer{
    public String descricao;

    public Carne(){
        descricao = "Hamburguer de carne";
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double preco() {
        return 23.50;
    }
}