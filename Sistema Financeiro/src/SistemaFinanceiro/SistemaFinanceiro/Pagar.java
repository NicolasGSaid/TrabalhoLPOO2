package SistemaFinanceiro;

import java.util.Scanner;

public class Pagar extends Financeiro {
    private Fornecedor fornecedor;
    private String boleto;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    @Override
    public void entrar() {
        super.entrar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do fornecedor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do fornecedor: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite a empresa do fornecedor: ");
        String empresa = scanner.nextLine();
        fornecedor = new Fornecedor(nome, cpf, empresa);
        fornecedor.entrar();
        System.out.print("Digite o boleto: ");
        setBoleto(scanner.nextLine());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Fornecedor: " + fornecedor.getNome());
        fornecedor.imprimir();
        System.out.println("Boleto: " + getBoleto());
    }
}