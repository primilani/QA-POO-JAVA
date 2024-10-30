package Desafio.Guincho;

public class SimuladorDeOrcamentoConcreto implements SimuladorDeOrcamento {
    @Override
    public double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto) {
        Guincho guincho = escolherGuincho(veiculo);
        return guincho.calcularCustoDoDeslocamento(trajeto);
    }

    private Guincho escolherGuincho(Veiculo veiculo) {
        if (veiculo.getTipo() == TipoVeiculo.ONIBUS || veiculo.getTipo() == TipoVeiculo.CAMINHAO) {
            return new CaminhaoReboqueIntegrado();  // Guincho para veículos pesados
        } else if (veiculo.getEstado() == EstadoConservacao.QUEBRADO) {
            return new CaminhaoCorrenteGancho();    // Guincho para veículos quebrados
        } else {
            return new CaminhaoGuinchoPlataforma(); // Guincho para veículos leves
        }
    }
}