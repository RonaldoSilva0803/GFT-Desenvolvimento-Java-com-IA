public class DescontoFixo implements DescontoStrategy {
private double valorDesconto;

public DescontoFixo(double valorDesconto) {
    this.valorDesconto = valorDesconto;
}

// Encapsulamento: Getter e Setter
public double getValorDesconto() {
    return valorDesconto;
}

public void setValorDesconto(double valorDesconto) {
    this.valorDesconto = valorDesconto;
}

@Override
public double calcularDesconto(double valor) {
    return valorDesconto;
}
}
