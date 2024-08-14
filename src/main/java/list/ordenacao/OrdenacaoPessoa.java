package main.java.list.ordenacao;

import java.util.*;

/*Ordenação de Pessoas

Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa" como atributo. Cada pessoa possui atributos como nome, idade e altura. 
Implemente os seguintes métodos:

    adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
    ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
    ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.
*/

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return  pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.86);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        //sem fazer ordenação
        System.out.println(ordenacaoPessoa.pessoaList);
        //ordenando por Idade
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        //ordenando por altura
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

