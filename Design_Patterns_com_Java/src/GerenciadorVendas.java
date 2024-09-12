import java.util.ArrayList;
import java.util.List;

//Singleton
public class GerenciadorVendas {
private static GerenciadorVendas instance;
private List<Venda> vendas;

private GerenciadorVendas() {
    vendas = new ArrayList<>();
}

public static synchronized GerenciadorVendas getInstance() {
    if (instance == null) {
        instance = new GerenciadorVendas();
    }
    return instance;
}

public void adicionarVenda(Venda venda) {
    vendas.add(venda);
}

public void exibirVendas() {
    for (Venda venda : vendas) {
        System.out.println(venda);
    }
}
}
