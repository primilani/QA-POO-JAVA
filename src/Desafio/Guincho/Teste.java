package Desafio.Guincho;

public class Teste {

    public static void main(String[] args) {
        // Criação de um trajeto entre os bairros
        Trajeto trajetoCentroA = new TrajetoEntreBairros(10);
        // Criando um veículo
        Veiculo carroNovo = new VeiculoConcreto(TipoVeiculo.CARRO, EstadoConservacao.NOVO);

        // Simulando o orçamento para o carro novo
        SimuladorDeOrcamento simulador = new SimuladorDeOrcamentoConcreto();
        double custo1 = simulador.calcularCustoTotal(carroNovo, trajetoCentroA);

        System.out.println("\nCusto do orçamento 1: R$ " + custo1);



        // Criação de um trajeto entre os bairros
        Trajeto trajetoCentroB = new TrajetoEntreBairros(15);
        // Criando um veículo
        Veiculo caminhaoQuebrado = new VeiculoConcreto(TipoVeiculo.CAMINHAO, EstadoConservacao.QUEBRADO);

        // Simulando o orçamento para o carro novo
        double custo2 = simulador.calcularCustoTotal(caminhaoQuebrado, trajetoCentroB);

        System.out.println("\nCusto do orçamento 2: R$ " + custo2);



        // Criação de um trajeto entre os bairros
        Trajeto trajetoCentroCentro = new TrajetoEntreBairros(10);
        // Criando um veículo
        Veiculo minivanQuebrado = new VeiculoConcreto(TipoVeiculo.MINIVAN, EstadoConservacao.QUEBRADO);

        // Simulando o orçamento para o carro novo
        double custo3 = simulador.calcularCustoTotal(minivanQuebrado, trajetoCentroCentro);

        System.out.println("\nCusto do orçamento 3: R$ " + custo3);



        // Criação de um trajeto entre os bairros
        Trajeto trajetoAB = new TrajetoEntreBairros(10);
        // Criando um veículo
        Veiculo onibusNovo = new VeiculoConcreto(TipoVeiculo.ONIBUS, EstadoConservacao.NOVO);

        // Simulando o orçamento para o carro novo
        double custo4 = simulador.calcularCustoTotal(onibusNovo, trajetoAB);

        System.out.println("\nCusto do orçamento 4: R$ " + custo4);
    }

}