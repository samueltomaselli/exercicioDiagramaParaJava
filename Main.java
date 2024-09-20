package exercicioClass;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setCPF("123.777.777-00");
        pessoa.setNome("Samuel Tomaselli");
        pessoa.setRG("12.777.678-9");
        pessoa.setTelefone("(11) 99999-9999");
        pessoa.setEndereco("Rua das Flores, 38");
        System.out.println("Pessoa criada: " + pessoa.getNome());
        System.out.println("CPF válido: " + pessoa.validarCPF());
        System.out.println("RG válido: " + pessoa.validarRG());
        System.out.println("Telefone válido: " + pessoa.validarTelefone());
        System.out.println("Usuário não duplicado: " + pessoa.validarUsuariosDuplicados());

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setBanco("Inter");
        pessoaFisica.setAgencia("7777");
        pessoaFisica.setTipoAssociado("Gold");
        System.out.println("Banco: " + pessoaFisica.getBanco());
        System.out.println("Banco válido: " + pessoaFisica.validarBanco());
        System.out.println("Agência válida: " + pessoaFisica.validarAgencia());

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj("12.777.777/7777-77");
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
        System.out.println("CNPJ válido: " + pessoaJuridica.validarCnpj());

        Associado associado = new Associado();
        associado.setId(1);
        associado.setSenha("senhasenha");
        System.out.println("ID: " + associado.getId());
        System.out.println("Banco válido: " + associado.validarBanco());
        System.out.println("Agência válida: " + associado.validarAgencia());
        associado.pagarMensalidade();

        ContaFinanceira conta = new ContaFinanceira();
        conta.setSaldo(1000.0f);
        conta.setLimite(500.0f);
        System.out.println("Saldo: " + conta.getSaldo() + ", Limite: " + conta.getLimite());
        conta.receberDepositos(200.0f);
        conta.debitarSaldo(50.0f);
        System.out.println("Saque permitido: " + conta.permitirSaque(300.0f));
        conta.sacar(100.0f);
        conta.cadastrarLimite(1000.0f);
        conta.efetuarCompra(75.0f);

        ControleDeEstoque estoque = new ControleDeEstoque();
        estoque.cadastrarProdutos("Produto A", 10);
        estoque.gerarRelatorioPosicao();
        estoque.gerarRelatorioEntradaSaida();
        estoque.emitirNotaFiscal();
        System.out.println("Relação com jurídico: " + estoque.verificarRelacaoComJuridico());

        ControleEntradaSaida controle = new ControleEntradaSaida();
        controle.setDataHoraEntrada(LocalDateTime.now());
        controle.setDataHoraSaida(LocalDateTime.now().plusHours(8));
        controle.setPresenca(true);
        System.out.println("Entrada: " + controle.getDataHoraEntrada());
        System.out.println("Saída: " + controle.getDataHoraSaida());
        System.out.println("Presença: " + controle.getPresenca());
        System.out.println("Associado válido: " + controle.validarAssociado("777"));
        controle.registrarPresenca("777");
        controle.registrarEntrada("777");
        controle.registrarSaida("777");
        System.out.println("Verificar presença: " + controle.verificarPresenca("777"));
        System.out.println("Verificar pendências: " + controle.verificarPendencias("777"));

        Mensalidade mensalidade = new Mensalidade();
        mensalidade.setReferencia(202109);
        mensalidade.setValorPago(100.0f);
        mensalidade.setDataVencimento(LocalDateTime.now().plusMonths(1));
        System.out.println("Referência: " + mensalidade.getReferencia());
        System.out.println("Valor pago: " + mensalidade.getValorPago());
        System.out.println("Data de vencimento: " + mensalidade.getDataVencimento());
        mensalidade.gerarMensalidade(202110, 150.0f, LocalDateTime.now().plusMonths(2));

        Vendas vendas = new Vendas();
        vendas.setId(1);
        vendas.setVendas(Arrays.asList("Venda 1", "Venda 2"));
        vendas.setTotal(1000.0f);
        System.out.println("ID: " + vendas.getId());
        System.out.println("Total de vendas: " + vendas.getTotal());
        vendas.alertarLimite(1000.0f);
        vendas.efetuarVenda("Produto B", 200.0f);
        vendas.gerarSaldoNegativo(conta, 1500.0f);
        System.out.println("Total calculado: " + vendas.calcularTotal());
    }
}