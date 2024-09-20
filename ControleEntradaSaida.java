package exercicioClass;

import java.time.LocalDateTime;

public class ControleEntradaSaida {
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
    private Boolean presenca;

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public Boolean getPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = true;
    }

    public boolean validarAssociado(String associadoId) {
        return true;
    }

    public void registrarPresenca(String associadoId) {
        System.out.println("Presença registrada.");
    }

    public void registrarEntrada(String associadoId) {
        System.out.println("Entrada registrada.");
    }

    public void registrarSaida(String associadoId) {
        System.out.println("Saída registrada.");
    }

    public boolean verificarPresenca(String associadoId) {
        return true;
    }

    public boolean verificarPendencias(String associadoId) {
        return true;
    }
}