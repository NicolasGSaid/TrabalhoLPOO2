package SistemaFinanceiro;

import java.util.Scanner;

@SuppressWarnings("resource")


public abstract class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private String contato;

    public PessoaJuridica(String cnpj, String inscricaoEstadual, String contato) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.contato = contato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public void entrar() {
        super.entrar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CNPJ: ");
        setCnpj(scanner.nextLine());
        System.out.print("Digite a Inscrição Estadual: ");
        setInscricaoEstadual(scanner.nextLine());
        System.out.print("Digite o contato: ");
        setContato(scanner.nextLine());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Inscrição Estadual: " + getInscricaoEstadual());
        System.out.println("Contato: " + getContato());
    }
}