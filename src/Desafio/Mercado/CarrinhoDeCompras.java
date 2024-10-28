package Desafio.Mercado;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private String formaDePagamento;


    public void adiconarItem(Produto produto){
        produtos.add(produto);
    }

    public double calcularTotal(){
        int totalDeUnidades = 0;
        double totalPrecoSemDesconto = 0.0;

        for(Produto produto: produtos) {
            totalDeUnidades = totalDeUnidades + produto.getQuantidade();
            totalPrecoSemDesconto = totalPrecoSemDesconto + (produto.getPreco() * produto.getQuantidade());
        }

        double totalPrecoComDesconto = 0.0;

        if(totalDeUnidades <= 5) {
            totalPrecoComDesconto = totalPrecoSemDesconto;

        } else if(totalDeUnidades <= 15) {
            totalPrecoComDesconto = totalPrecoSemDesconto * 0.9;

        } else if(totalDeUnidades <= 25) {
            totalPrecoComDesconto = totalPrecoSemDesconto * 0.8;

        } else {
            totalPrecoComDesconto = totalPrecoSemDesconto * 0.75;
        }

        if(formaDePagamento.equals("dinheiro")) {
            totalPrecoComDesconto = totalPrecoSemDesconto * 0.95;

        } else if(formaDePagamento.equals("credito")) {
            totalPrecoComDesconto = totalPrecoSemDesconto * 1.03;
        }

        return totalPrecoComDesconto;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

}