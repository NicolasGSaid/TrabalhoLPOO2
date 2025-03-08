package SistemaFinanceiro;

import java.util.Scanner;

public abstract class Pessoa {
    private int id;
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void entrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID: ");
        setId(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Digite o nome: ");
        setNome(scanner.nextLine());
        System.out.print("Digite o email: ");
        setEmail(scanner.nextLine());
        System.out.println("Digite o endereço:");
        Endereco endereco = new Endereco("", "", "", "", "", "", "");
        endereco.entrar();
        setEndereco(endereco);
        System.out.println("Digite o telefone:");
        Telefone telefone = new Telefone();
        telefone.entrar();
        setTelefone(telefone);
    }

    public void imprimir() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Endereço: ");
        getEndereco().imprimir();
        System.out.println("Telefone: ");
        getTelefone().imprimir();
    }
}