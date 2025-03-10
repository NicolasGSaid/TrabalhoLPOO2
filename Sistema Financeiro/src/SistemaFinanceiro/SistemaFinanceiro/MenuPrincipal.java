package SistemaFinanceiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("resource")

public class MenuPrincipal {
    private List<Cliente> clientes;
    private List<Fornecedor> fornecedores;
    private List<Funcionario> funcionarios;
    private List<Receber> contasReceber;
    private List<Pagar> contasPagar;

    public MenuPrincipal() {
        clientes = new ArrayList<>();
        fornecedores = new ArrayList<>();
        funcionarios = new ArrayList<>();
        contasReceber = new ArrayList<>();
        contasPagar = new ArrayList<>();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu Principal:");
            System.out.println("1) Cadastro de Funcionários");
            System.out.println("2) Cadastro de Clientes");
            System.out.println("3) Cadastro de Fornecedores");
            System.out.println("4) Contas a Receber");
            System.out.println("5) Contas a Pagar");
            System.out.println("6) Fluxo de Caixa");
            System.out.println("7) Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    subMenu("Funcionário");
                    break;
                case 2:
                    subMenu("Cliente");
                    break;
                case 3:
                    subMenu("Fornecedor");
                    break;
                case 4:
                    subMenu("Receber");
                    break;
                case 5:
                    subMenu("Pagar");
                    break;
                case 6:
                    mostrarFluxoCaixa();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (option != 7);
    }

    public void subMenu(String tipoCadastro) {
        Scanner scanner = new Scanner(System.in);
        char option;

        do {
            System.out.println("Cadastro de " + tipoCadastro + ":");
            System.out.println("a) Incluir");
            System.out.println("b) Alterar");
            System.out.println("c) Consultar");
            System.out.println("d) Excluir");
            System.out.println("e) Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            option = scanner.next().charAt(0);

            switch (option) {
                case 'a':
                    incluir(tipoCadastro);
                    break;
                case 'b':
                    alterar(tipoCadastro);
                    break;
                case 'c':
                    consultar(tipoCadastro);
                    break;
                case 'd':
                    excluir(tipoCadastro);
                    break;
                case 'e':
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (option != 'e');
    }

    private void incluir(String tipoCadastro) {
        switch (tipoCadastro) {
            case "Funcionário":
                Funcionario funcionario = new Funcionario();
                funcionario.entrar();
                funcionarios.add(funcionario);
                break;
            case "Cliente":
                Cliente cliente = new Cliente();
                cliente.entrar();
                clientes.add(cliente);
                break;
            case "Fornecedor":
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.entrar();
                fornecedores.add(fornecedor);
                break;
            case "Receber":
                Receber receber = new Receber();
                receber.entrar();
                contasReceber.add(receber);
                break;
            case "Pagar":
                Pagar pagar = new Pagar();
                pagar.entrar();
                contasPagar.add(pagar);
                break;
        }
    }

    private void alterar(String tipoCadastro) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID do " + tipoCadastro + " que deseja alterar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        switch (tipoCadastro) {
            case "Funcionário":
                for (Funcionario funcionario : funcionarios) {
                    if (funcionario.getId() == id) {
                        funcionario.entrar();
                        return;
                    }
                }
                System.out.println(tipoCadastro + " não encontrado.");
                break;
            case "Cliente":
                for (Cliente cliente : clientes) {
                    if (cliente.getId() == id) {
                        cliente.entrar();
                        return;
                    }
                }
                System.out.println(tipoCadastro + " não encontrado.");
                break;
            case "Fornecedor":
                for (Fornecedor fornecedor : fornecedores) {
                    if (fornecedor.getId() == id) {
                        fornecedor.entrar();
                        return;
                    }
                }
                System.out.println(tipoCadastro + " não encontrado.");
                break;
            case "Receber":
                for (Receber receber : contasReceber) {
                    if (receber.getId() == id) {
                        receber.entrar();
                        return;
                    }
                }
                System.out.println(tipoCadastro + " não encontrado.");
                break;
            case "Pagar":
                for (Pagar pagar : contasPagar) {
                    if (pagar.getId() == id) {
                        pagar.entrar();
                        return;
                    }
                }
                System.out.println(tipoCadastro + " não encontrado.");
                break;
        }
    }

    private void consultar(String tipoCadastro) {
        switch (tipoCadastro) {
            case "Funcionário":
                for (Funcionario funcionario : funcionarios) {
                    funcionario.imprimir();
                }
                break;
            case "Cliente":
                for (Cliente cliente : clientes) {
                    cliente.imprimir();
                }
                break;
            case "Fornecedor":
                for (Fornecedor fornecedor : fornecedores) {
                    fornecedor.imprimir();
                }
                break;
            case "Receber":
                for (Receber receber : contasReceber) {
                    receber.imprimir();
                }
                break;
            case "Pagar":
                for (Pagar pagar : contasPagar) {
                    pagar.imprimir();
                }
                break;
        }
    }

    private void excluir(String tipoCadastro) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID do " + tipoCadastro + " que deseja excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        switch (tipoCadastro) {
            case "Funcionário":
                funcionarios.removeIf(funcionario -> funcionario.getId() == id);
                break;
            case "Cliente":
                clientes.removeIf(cliente -> cliente.getId() == id);
                break;
            case "Fornecedor":
                fornecedores.removeIf(fornecedor -> fornecedor.getId() == id);
                break;
            case "Receber":
                contasReceber.removeIf(receber -> receber.getId() == id);
                break;
            case "Pagar":
                contasPagar.removeIf(pagar -> pagar.getId() == id);
                break;
        }
    }

    private void mostrarFluxoCaixa() {
        double totalCredito = 0;
        double totalDebito = 0;
        double saldo = 0;

        System.out.println("--------------------------------------------------------");
        System.out.println("                                 FLUXO DE CAIXA");
        System.out.println("---------------------------------------------------------");
        System.out.println("Vencimento | Crédito | Débito | Saldo");

        for (Receber receber : contasReceber) {
            double valorReceber = receber.getValor() + receber.getJuros() - receber.getDesconto();
            totalCredito += valorReceber;
            saldo += valorReceber;
            System.out.printf("%s | %.2f | %.2f | %.2f\n", receber.getVencimento(), valorReceber, 0.0, saldo);
        }

        for (Pagar pagar : contasPagar) {
            double valorPagar = pagar.getValor() + pagar.getJuros() + pagar.getMulta() - pagar.getDesconto();
            totalDebito += valorPagar;
            saldo -= valorPagar;
            System.out.printf("%s | %.2f | %.2f | %.2f\n", pagar.getVencimento(), 0.0, valorPagar, saldo);
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("Totais     | %.2f | %.2f | %.2f\n", totalCredito, totalDebito, saldo);
    }
}