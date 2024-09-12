public class Venda {
private double valorTotal;
private DescontoStrategy descontoStrategy;

public Venda(double valorTotal, DescontoStrategy descontoStrategy) {
    this.valorTotal = valorTotal;
    this.descontoStrategy = descontoStrategy;
}

// Encapsulamento: Getters e Setters
public double getValorTotal() {
    return valorTotal;
}

public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
}

public DescontoStrategy getDescontoStrategy() {
    return descontoStrategy;
}

public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
    this.descontoStrategy = descontoStrategy;
}

public double calcularTotalComDesconto() {
    return valorTotal - descontoStrategy.calcularDesconto(valorTotal);
}

@Override
public String toString() {
    return String.format("Valor Total: %.2f, Valor com Desconto: %.2f", valorTotal, calcularTotalComDesconto());
}
}
