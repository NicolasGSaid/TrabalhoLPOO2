package SistemaFinanceiro;

import java.util.Scanner;

@SuppressWarnings("resource")


public class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return rua + ", " + numero + (complemento.isEmpty() ? "" : " " + complemento) + ", " + bairro + ", " + cidade + ", " + estado + ", " + cep;
    }

    public String getLogradouro() {
        return rua;
    }

    public void setLogradouro(String logradouro) {
        this.rua = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void entrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a rua: ");
        setLogradouro(scanner.nextLine());
        System.out.print("Digite o número: ");
        setNumero(scanner.nextLine());
        System.out.print("Digite o complemento: ");
        setComplemento(scanner.nextLine());
        System.out.print("Digite o bairro: ");
        setBairro(scanner.nextLine());
        System.out.print("Digite a cidade: ");
        setCidade(scanner.nextLine());
        System.out.print("Digite o estado: ");
        setEstado(scanner.nextLine());
        System.out.print("Digite o CEP: ");
        setCep(scanner.nextLine());
    }

    public void imprimir() {
        System.out.println("Endereço: " + toString());
    }
}