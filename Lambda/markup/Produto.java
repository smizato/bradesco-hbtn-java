import java.util.function.*;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10.0;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public Supplier<Double> precoComMarkup = () -> {
        return preco * (1 + (percentualMarkup / 100));
    };

    public Consumer<Double> atualizarMarkup = (Double novoMarkup) -> {
        this.percentualMarkup = novoMarkup;
    };
}
