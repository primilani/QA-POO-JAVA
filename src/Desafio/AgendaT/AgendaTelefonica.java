package Desafio.AgendaT;

import java.util.ArrayList;

public class AgendaTelefonica {

    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato){ // Adiciona um contato da agenda com base no nome
        contatos.add(contato);
    }

    public void removerContato(String nome){ // Remove um contato da agenda com base no nome
        Contato contato = buscarContato(nome);
        if(contato != null) {
            contatos.remove(contato);
        }
    }

    public Contato buscarContato(String nome) {// Retorna um contato na agenda com base no nome
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void atualizarContato(String nome, Contato novoContato){ // Atualiza as informações de um contato com base no nome
        removerContato(nome);
        adicionarContato(novoContato);
    }

    public ArrayList<Contato> listarContatos(){ // Lista todos os contatos na agenda
        return contatos;
    }

}