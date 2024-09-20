package exercicioClass;

public class ControleDeEstoque {
    public void cadastrarProdutos(String produto, int quantidade) {
        System.out.println("Produto cadastrado.");
    }

    public void gerarRelatorioPosicao() {
        System.out.println("Relatório de posição gerado.");
    }

    public void gerarRelatorioEntradaSaida() {
        System.out.println("Relatório de entrada e saída gerado.");
    }

    public void emitirNotaFiscal() {
        System.out.println("Nota fiscal emitida.");
    }

    public boolean verificarRelacaoComJuridico() {
        return true;
    }
}