package idea.java;

public class Venda {
    private Veiculo veiculo;
    private String data;

    public Venda(Veiculo veiculo, String data) {
        this.veiculo = veiculo;
        this.data = data;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public String getData() {
        return data;
    }

    public double getValorVenda() {
        return veiculo.getValorVenda();
    }

    public double getLucroVenda() {
        return veiculo.getLucro();
    }
}
