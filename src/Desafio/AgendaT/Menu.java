package Desafio.AgendaT;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        AgendaTelefonica agendaTelefonica = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n\n**** Agenda Telefônica *****");
            System.out.println("1 - Adicionar novo contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Buscar contato pelo nome");
            System.out.println("4 - Atualizar Contato");
            System.out.println("5 - Listar todos os contatos na agenda");
            System.out.println("6 - Sair do programa\n");

            System.out.print("Informe a opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: // Adiciona Contato
                    System.out.print("\nDigite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("\nDigite o telefone: ");
                    String telefone = scanner.nextLine();

                    if(agendaTelefonica.buscarContato(nome) == null) {
                        Contato contato = new Contato();
                        contato.setNome(nome);
                        contato.setTelefone(telefone);
                        agendaTelefonica.adicionarContato(contato);
                        System.out.print("\nContato salvo com sucesso!");
                    } else {
                        System.out.println("Contato já existente");
                    }
                    break;

                case 2: // Remover Contato
                    System.out.print("\nDigite o nome: ");
                    String nomeParaRemover = scanner.nextLine();

                    agendaTelefonica.removerContato(nomeParaRemover);
                    System.out.print("\nContato removido com sucesso!");
                    break;

                case 3: // Buscar contato pelo nome
                    System.out.print("\nDigite o nome: ");
                    String nomeParaBuscar = scanner.nextLine();

                    Contato contatoEncontrado = agendaTelefonica.buscarContato(nomeParaBuscar);

                    if (contatoEncontrado != null) {
                        System.out.print("\nNome: " + contatoEncontrado.getNome());
                        System.out.print("\nTelefone: " + contatoEncontrado.getTelefone());
                    } else {
                        System.out.print("\nContato não encontrado");
                    }
                    break;

                case 4: // Atualiza Contato
                    System.out.print("\nDigite o nome a ser atualizado: ");
                    String nomeASerAtualizado = scanner.nextLine();

                    System.out.print("\nDigite o novo nome: ");
                    String novoNome = scanner.nextLine();

                    System.out.print("\nDigite o novo telefone: ");
                    String novoTelefone = scanner.nextLine();

                    Contato contatoAtualizado = new Contato();
                    contatoAtualizado.setNome(novoNome);
                    contatoAtualizado.setTelefone(novoTelefone);

                    agendaTelefonica.atualizarContato(nomeASerAtualizado, contatoAtualizado);
                    System.out.print("\nContato atualizado com sucesso!");
                    break;

                case 5: // Lista todos os contatos
                    ArrayList<Contato> contatos = agendaTelefonica.listarContatos();
                    for(Contato contatoDaLista : contatos) {
                        System.out.println("Nome: " + contatoDaLista.getNome());
                        System.out.println("Telefone: " + contatoDaLista.getTelefone());
                    }
                    break;

                case 6: // Sair
                    System.out.println("Obrigado");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");

            }
        }

    }

}