package exercicioClass;
import java.util.ArrayList;
import java.util.List;

public class Associado extends Pessoa {
    private int id;
    private String senha;
    private List<Mensalidade> mensalidades = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Mensalidade> getMensalidades() {
        return mensalidades;
    }

    public void setMensalidades(List<Mensalidade> mensalidades) {
        this.mensalidades = mensalidades;
    }

    public boolean validarBanco() {
        return true;
    }

    public boolean validarAgencia() {
        return true;
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade paga.");
    }
}