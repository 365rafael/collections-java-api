package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

/* Catálogo de Livros
 *
 * Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título, autor e ano de publicação.
 * Implemente os seguintes métodos:
 *
 *    adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.
 *    pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.
 *    pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
 *    pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.
 * */
public class CatalogoLivros {
    private List<Livro> livroList;

    //iniciando uma lista vazia.
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionalLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalo.add(l);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisaLivroPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionalLivro("Livro 1", "Autor 1", 2010);
        catalogoLivros.adicionalLivro("Livro 1", "Autor 2", 2012);
        catalogoLivros.adicionalLivro("Livro 3", "Autor 2", 2020);
        catalogoLivros.adicionalLivro("Livro 4", "Autor 4", 2014);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisaLivroPorTitulo("Livro 1"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2015, 2021));
    }
}
