package main.java.list.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //usar function com lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        //metodo alternativo
        List<Integer> numerosDobradosNew = numeros.stream()
                .map(n -> n * 2)
                .toList();
        //imprimir
        numerosDobrados.forEach(System.out::println);
        numerosDobradosNew.forEach(System.out::println);
    }
}
