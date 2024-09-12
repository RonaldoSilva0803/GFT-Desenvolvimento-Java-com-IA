public class SistemaVendas {
public static void main(String[] args) {
    // Obtendo a instância única do Gerenciador de Vendas
    GerenciadorVendas gerenciador = GerenciadorVendas.getInstance();
    
    // Criando estratégias de desconto
    DescontoStrategy descontoPorcentagem = new DescontoPorcentagem(10); // 10%
    DescontoStrategy descontoFixo = new DescontoFixo(50); // R$50
    
    // Criando e adicionando vendas
    Venda venda1 = new Venda(500, descontoPorcentagem);
    Venda venda2 = new Venda(300, descontoFixo);
    gerenciador.adicionarVenda(venda1);
    gerenciador.adicionarVenda(venda2);
    
    // Exibindo todas as vendas
    gerenciador.exibirVendas();
}
}
