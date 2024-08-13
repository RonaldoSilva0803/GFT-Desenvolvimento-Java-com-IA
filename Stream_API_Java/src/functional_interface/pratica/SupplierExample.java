package functional_interface.pratica;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        //Usar Supplier com expressão lambida para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "olá, seja bem-vindo(a)";

        //Usar o Supplier para obter uma lista com 5 saudação.
        List<String> listaSaudacao = Stream.generate(() -> "olá, seja bem-vindo(a)!")
                .limit(5)
                .toList();
        //imprime as saudações geradas
        listaSaudacao.forEach(System.out::println);
    }
}
