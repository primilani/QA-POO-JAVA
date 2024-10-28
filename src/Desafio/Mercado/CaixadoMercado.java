package Desafio.Mercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CaixadoMercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtosDisponiveis = new ArrayList<>(Arrays.asList(
                new Produto(1, "Café 500g", 18.90, 0),
                new Produto(2, "Arroz 1kg", 8.48, 0),
                new Produto(3, "Patinho Bovino", 60.00, 0),
                new Produto(4, "Refrigerante", 8.50, 0)
        ));
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("ID | Nome | Preço\n");
        for(Produto produto: produtosDisponiveis) {
            System.out.println(produto.getId() + " | " + produto.getNome() + " | " + produto.getPreco());
        }

        System.out.print("\nDigite a forma de pagamento : ");
        String formaDePagamento = scanner.nextLine();
        carrinho.setFormaDePagamento(formaDePagamento);

        while(true) {
            System.out.print("\nDigite o ID do produto que deseja: ");
            int idDoProduto = scanner.nextInt();

            System.out.print("\nDigite a quantidade que deseja: ");
            int quantidade = scanner.nextInt();


            // Limpar o scanner depois do nextInt
            scanner.nextLine();



            Produto produto = new Produto();

            for(Produto produtoDisponivel: produtosDisponiveis) { // Passando em todos os itens da lista um por um e comparando o id com o id que o cliente digitou
                if(produtoDisponivel.getId() == idDoProduto) {
                    produto = new Produto(produtoDisponivel.getId(), produtoDisponivel.getNome(), produtoDisponivel.getPreco(), 0);
                    break;
                }
            }

            if(produto.getId() == 0) {
                System.out.println("Produto indisponivel!!");
            } else {
                produto.setQuantidade(quantidade);
                carrinho.adiconarItem(produto);
            }

            System.out.print("\ndeseja adicionar mais produtos? s/n:  ");
            String continuar = scanner.nextLine();

            if(continuar.equals("n")) {
                break;
            }
        }

        System.out.println("Preço total: R$ "  + carrinho.calcularTotal());
    }

}
