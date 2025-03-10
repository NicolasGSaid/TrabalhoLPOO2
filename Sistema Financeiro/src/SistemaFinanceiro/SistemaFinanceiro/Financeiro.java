package SistemaFinanceiro;

import java.util.Scanner;

@SuppressWarnings("resource")


public abstract class Financeiro {
    private int id;
    private int numero;
    private String emissao;
    private String vencimento;
    private String pagamento;
    private double valor;
    private double juros;
    private double multa;
    private double desconto;
    private double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmissao() {
        return emissao;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void entrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID: ");
        setId(scanner.nextInt());
        System.out.print("Digite o número: ");
        setNumero(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Digite a data de emissão: ");
        setEmissao(scanner.nextLine());
        System.out.print("Digite a data de vencimento: ");
        setVencimento(scanner.nextLine());
        System.out.print("Digite a data de pagamento: ");
        setPagamento(scanner.nextLine());
        System.out.print("Digite o valor: ");
        setValor(scanner.nextDouble());
        System.out.print("Digite os juros: ");
        setJuros(scanner.nextDouble());
        System.out.print("Digite a multa: ");
        setMulta(scanner.nextDouble());
        System.out.print("Digite o desconto: ");
        setDesconto(scanner.nextDouble());
        System.out.print("Digite o total: ");
        setTotal(scanner.nextDouble());
    }

    public void imprimir() {
        System.out.println("ID: " + getId());
        System.out.println("Número: " + getNumero());
        System.out.println("Data de Emissão: " + getEmissao());
        System.out.println("Data de Vencimento: " + getVencimento());
        System.out.println("Data de Pagamento: " + getPagamento());
        System.out.println("Valor: " + getValor());
        System.out.println("Juros: " + getJuros());
        System.out.println("Multa: " + getMulta());
        System.out.println("Desconto: " + getDesconto());
        System.out.println("Total: " + getTotal());
    }
}