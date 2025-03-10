package SistemaFinanceiro;

import java.util.Scanner;

@SuppressWarnings("resource")


public abstract class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;
    private String emissor;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    @Override
    public void entrar() {
        super.entrar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        setCpf(scanner.nextLine());
        System.out.print("Digite o RG: ");
        setRg(scanner.nextLine());
        System.out.print("Digite o emissor do RG: ");
        setEmissor(scanner.nextLine());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CPF: " + getCpf());
        System.out.println("RG: " + getRg());
        System.out.println("Emissor do RG: " + getEmissor());
    }
}