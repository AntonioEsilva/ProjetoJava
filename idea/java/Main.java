package idea.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LojaAutomoveis loja = new LojaAutomoveis();

        System.out.println("Quantos dias de vendas deseja registrar?");
        int dias = scanner.nextInt();

        System.out.println("Quantas vendas deseja registrar?");
        int totalVendas = scanner.nextInt();

        for (int i = 0; i < totalVendas; i++) {
            System.out.println("Registro de Venda #" + (i + 1));

            System.out.print("Modelo do veículo: ");
            String modelo = scanner.next();

            System.out.print("Valor da venda: R$ ");
            double valorVenda = scanner.nextDouble();

            System.out.print("Lucro sobre o veículo: R$ ");
            double lucro = scanner.nextDouble();

            System.out.print("Data da venda (dd/MM/yyyy): ");
            String data = scanner.next();

            Carro carro = new Carro(modelo, valorVenda, lucro);
            Venda venda = new Venda(carro, data);
            loja.registrarVenda(venda);
        }

        System.out.println("\nRelatório Final:");
        loja.exibirRelatorio();
        System.out.println("Média de veículos vendidos por dia: " + loja.calcularMediaVeiculosPorDia(dias));

        scanner.close();
    }
}
