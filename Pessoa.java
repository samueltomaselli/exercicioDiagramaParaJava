package exercicioClass;

public class Pessoa {
    protected String CPF;
    protected String nome;
    protected String RG;
    protected String telefone;
    protected String endereco;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean validarCPF() {
        return true;
    }

    public boolean validarRG() {
        return true;
    }

    public boolean validarTelefone() {
        return true;
    }

    public boolean validarUsuariosDuplicados() {
        return true;
    }
}