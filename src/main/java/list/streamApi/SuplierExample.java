package main.java.list.streamApi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuplierExample {
    public static void main(String[] args) {
        // usar o supplier com lambda para fornecer saudação
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
        // usar o supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        // modo alternativo mais clean
        List<String> listaSaudacoesLambda = Stream.generate(() -> "Olá, seja bem-vindo novamente!")
                .limit(5)
                .toList();

        //imprimir as saudações
        listaSaudacoes.forEach(System.out::println);
        listaSaudacoesLambda.forEach(System.out::println);
    }
}
