package idea.java;

public abstract class Veiculo {
    private String modelo;
    private double valorVenda;
    private double lucro;

    public Veiculo(String modelo, double valorVenda, double lucro) {
        this.modelo = modelo;
        this.valorVenda = valorVenda;
        this.lucro = lucro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public abstract void exibirDetalhes();
}
