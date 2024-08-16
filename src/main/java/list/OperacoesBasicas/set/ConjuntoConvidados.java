package main.java.list.OperacoesBasicas.set;

import main.java.list.pesquisa.CatalogoLivros;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public  int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        //add convidados
        conjuntoConvidados.adicionarConvidado("Convidado 1", 2010);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 2011);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 2012);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 2013);
        //repetindo o mesmo código pra verificar se vai aceitar ou não
        conjuntoConvidados.adicionarConvidado("Convidado 5", 2013);
        //exibindo convidados
        conjuntoConvidados.exibirConvidados();
        //fazendo a contagem dos convidados
        System.out.println(conjuntoConvidados.contarConvidados());
        //removendo convidado
        conjuntoConvidados.removerConvidadoPorCodigoConvite(2011);
        //exibindo novamente os convidados
        conjuntoConvidados.exibirConvidados();
        //fazendo nova contagem de convidados
        System.out.println(conjuntoConvidados.contarConvidados());

    }
}
