package exercicioClass;

import java.time.LocalDateTime;

public class Mensalidade {
    private int referencia;
    private float valorPago;
    private LocalDateTime dataVencimento;

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void gerarMensalidade(int ref, float valor, LocalDateTime vencimento) {
        System.out.println("Mensalidade gerada.");
    }
}