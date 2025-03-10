package SistemaFinanceiro;

import java.util.Scanner;

@SuppressWarnings("resource")


public class Telefone {
    private int ddd;
    private long numero;

    public Telefone() {
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void entrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o DDD: ");
        setDdd(scanner.nextInt());
        System.out.print("Digite o número: ");
        setNumero(scanner.nextLong());
    }

    public void imprimir() {
        System.out.println("Telefone: (" + getDdd() + ") " + getNumero());
    }
}