package SistemaFinanceiro;

import java.util.Scanner;

@SuppressWarnings("resource")


public class Funcionario extends PessoaFisica {
    private String dataAdmissao;
    private String dataDemissao;
    private String ctps;
    private double salario;

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void entrar() {
        super.entrar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a data de admissão: ");
        setDataAdmissao(scanner.nextLine());
        System.out.print("Digite a data de demissão: ");
        setDataDemissao(scanner.nextLine());
        System.out.print("Digite o CTPS: ");
        setCtps(scanner.nextLine());
        System.out.print("Digite o salário: ");
        setSalario(scanner.nextDouble());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Data de Admissão: " + getDataAdmissao());
        System.out.println("Data de Demissão: " + getDataDemissao());
        System.out.println("CTPS: " + getCtps());
        System.out.println("Salário: " + getSalario());
    }
}