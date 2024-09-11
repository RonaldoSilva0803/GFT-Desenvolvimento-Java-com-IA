// Classe iPhone que agrega as funcionalidades das outras classes
public class iPhone extends ReprodutorMusical {
private final AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
private final NavegadorInternet navegadorInternet = new NavegadorInternet();

public String salvarNumero(String numero) {
    return "Número " + numero + " salvo";
}

public String verificaConexao() {
    return "Conexão verificada";
}

public String downloadMusica(String musica) {
    return "Baixando música " + musica;
}

// Métodos delegados para AparelhoTelefonico
public String fazerChamada(String numero) {
    return aparelhoTelefonico.fazerChamada(numero);
}

public String desligarChamada() {
    return aparelhoTelefonico.desligarChamada();
}

// Métodos delegados para NavegadorInternet
public String atualizarPagina() {
    return navegadorInternet.atualizarPagina();
}

public String navegar(String url) {
    return navegadorInternet.navegar(url);
}
}