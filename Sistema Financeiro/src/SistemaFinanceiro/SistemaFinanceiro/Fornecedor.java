package SistemaFinanceiro;

import java.util.Scanner;

@SuppressWarnings("resource")


public class Fornecedor extends PessoaJuridica {
    private double limiteCompra;
    private String dataCadastro;
    private String site;

    public Fornecedor(String cnpj, String inscricaoEstadual, String contato) {
        super(cnpj, inscricaoEstadual, contato);
    }

    public Fornecedor() {
        super("", "", "");
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }


    @Override
    public void entrar() {
        super.entrar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite de compra: ");
        setLimiteCompra(scanner.nextDouble());
        scanner.nextLine(); 
        System.out.print("Digite a data de cadastro: ");
        setDataCadastro(scanner.nextLine());
        System.out.print("Digite o site: ");
        setSite(scanner.nextLine());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Limite de Compra: " + getLimiteCompra());
        System.out.println("Data de Cadastro: " + getDataCadastro());
        System.out.println("Site: " + getSite());
    }
}