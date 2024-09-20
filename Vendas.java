package exercicioClass;

import java.util.ArrayList;
import java.util.List;

public class Vendas {
    private int id;
    private List<String> vendas = new ArrayList<>();
    private float total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getVendas() {
        return vendas;
    }

    public void setVendas(List<String> vendas) {
        this.vendas = vendas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void alertarLimite(float limite) {
        System.out.println("Limite atingido.");
    }

    public void efetuarVenda(String item, float valor) {
        System.out.println("Venda efetuado.");
    }

    public void gerarSaldoNegativo(ContaFinanceira conta, float valor) {
        System.out.println("Saldo negativado.");
    }

    public float calcularTotal() {
        return total;
    }
}