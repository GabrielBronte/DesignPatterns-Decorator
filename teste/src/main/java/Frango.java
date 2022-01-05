public class Frango implements Hamburguer{
    public String descricao;

    public Frango(){
        descricao = "Hamburguer de frango";
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double preco() {
        return 17.75;
    }
}
