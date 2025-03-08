package SistemaFinanceiro;

import java.util.Scanner;

public class Receber extends Financeiro {
    private Cliente cliente;
    private String notaFiscal;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    @Override
    public void entrar() {
        super.entrar();
        Scanner scanner = new Scanner(System.in);
        cliente = new Cliente();
        cliente.entrar();
        System.out.print("Digite a nota fiscal: ");
        setNotaFiscal(scanner.nextLine());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cliente: " + cliente.getNome());
        cliente.imprimir();
        System.out.println("Nota Fiscal: " + getNotaFiscal());
    }
}