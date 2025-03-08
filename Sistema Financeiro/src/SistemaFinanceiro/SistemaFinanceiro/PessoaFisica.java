package SistemaFinanceiro;

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
        
    }

    @Override
    public void imprimir() {
        super.imprimir();
       
    }
}
