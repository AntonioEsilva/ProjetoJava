package idea.java;

import java.util.ArrayList;

public class LojaAutomoveis {
    private ArrayList<Venda> vendas;

    public LojaAutomoveis() {
        this.vendas = new ArrayList<>();
    }

    public void registrarVenda(Venda venda) {
        vendas.add(venda);
    }

    public double calcularLucroTotal() {
        double lucroTotal = 0;
        for (Venda venda : vendas) {
            lucroTotal += venda.getLucroVenda();
        }
        return lucroTotal;
    }

    public double calcularMediaValorVenda() {
        if (vendas.isEmpty()) return 0;
        double totalValor = 0;
        for (Venda venda : vendas) {
            totalValor += venda.getValorVenda();
        }
        return totalValor / vendas.size();
    }

    public double calcularMediaVeiculosPorDia(int dias) {
        if (dias <= 0) return 0;
        return (double) vendas.size() / dias;
    }

    public void exibirRelatorio() {
        System.out.println("Número total de veículos vendidos: " + vendas.size());
        System.out.println("Lucro total: R$ " + calcularLucroTotal());
        System.out.println("Média do valor das vendas: R$ " + calcularMediaValorVenda());
    }
}
