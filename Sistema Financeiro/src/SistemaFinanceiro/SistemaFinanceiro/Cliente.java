package SistemaFinanceiro;

import java.util.Scanner;

@SuppressWarnings("resource")

public class Cliente extends PessoaJuridica {
    private double limiteCredito;
    private Endereco enderecoCobranca;

    public Cliente() {
        super("", "", "");
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Endereco getEnderecoCobranca() {
        return enderecoCobranca;
    }

    public void setEnderecoCobranca(Endereco enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
    }

    @Override
    public void entrar() {
        super.entrar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite de crédito: ");
        setLimiteCredito(scanner.nextDouble());
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Digite o endereço de cobrança (rua): ");
        String rua = scanner.nextLine();
        System.out.print("Digite o número: ");
        String numero = scanner.nextLine();
        System.out.print("Digite o complemento: ");
        String complemento = scanner.nextLine();
        System.out.print("Digite o bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Digite o estado: ");
        String estado = scanner.nextLine();
        System.out.print("Digite o CEP: ");
        String cep = scanner.nextLine();
        setEnderecoCobranca(new Endereco(rua, numero, complemento, bairro, cidade, estado, cep));
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Limite de Crédito: " + getLimiteCredito());
        System.out.println("Endereço de Cobrança: " + getEnderecoCobranca().toString());
    }
}