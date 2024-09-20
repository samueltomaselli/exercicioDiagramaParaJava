package exercicioClass;

public class ContaFinanceira extends Associado {
    private float saldo;
    private float limite;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void receberDepositos(float valor) {
        System.out.println("Depósito processado.");
    }

    public void debitarSaldo(float valor) {
        System.out.println("Saldo debitado.");
    }

    public boolean permitirSaque(float valor) {
        return true;
    }

    public void sacar(float valor) {
        System.out.println("Saque processado.");
    }

    public void cadastrarLimite(float novoLimite) {
        System.out.println("Limite cadastrado.");
    }

    public void efetuarCompra(float valor) {
        System.out.println("Compra efetuada.");
    }
}