public class ContaCorrente {

    private int numero;
    private double saldo;
    private String nomeTitular;

    public ContaCorrente(int numero) throws IllegalArgumentException {
        if(numero <= 0)
            throw new IllegalArgumentException("Número inválido: " + numero);
        else
            this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) throws IllegalArgumentException {
        if(nomeTitular.length() < 3)
            throw new IllegalArgumentException("Nome inválido");
        else
            this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor; 
    }

    public void retirar(double valor) throws IllegalArgumentException {
        if(saldo < valor)
            throw new IllegalArgumentException("Saldo insuficiente");
        else
            this.saldo -= valor;
    }

} 