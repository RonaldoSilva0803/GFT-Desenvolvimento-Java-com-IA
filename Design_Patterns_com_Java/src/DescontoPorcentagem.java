public class DescontoPorcentagem implements DescontoStrategy {
private double porcentagem;

public DescontoPorcentagem(double porcentagem) {
    this.porcentagem = porcentagem;
}

// Encapsulamento: Getter e Setter
public double getPorcentagem() {
    return porcentagem;
}

public void setPorcentagem(double porcentagem) {
    this.porcentagem = porcentagem;
}

@Override
public double calcularDesconto(double valor) {
    return valor * porcentagem / 100;
}
}
