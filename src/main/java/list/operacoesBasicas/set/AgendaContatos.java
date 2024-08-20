package main.java.list.operacoesBasicas.set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Ana", 96428564);
        agendaContatos.adicionarContato("Rafa", 997132663);
        agendaContatos.adicionarContato("Rafa", 97132663);
        agendaContatos.adicionarContato("Maria", 995959595);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Rafa"));
        System.out.println("Atualizando número");
        System.out.println(agendaContatos.atualizarContato("Ana", 996428564));
        agendaContatos.exibirContatos();

    }
}
