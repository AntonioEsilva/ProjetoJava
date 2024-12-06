package idea.java;

public class Carro extends Veiculo {

    public Carro(String modelo, double valorVenda, double lucro) {
        super(modelo, valorVenda, lucro);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Valor de Venda: R$ " + getValorVenda());
        System.out.println("Lucro: R$ " + getLucro());
    }
}
