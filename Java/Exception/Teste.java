public class Teste {

    public static void main(String args[]) {

        ContaCorrente conta = new ContaCorrente(19);
        conta.setNomeTitular("Aloísio");
        conta.depositar(500.00);
        System.out.println("Número: " + conta.getNumero() + "\nNome titular: " + conta.getNomeTitular() + "\nSaldo: " + conta.getSaldo());
        conta.retirar(550.00);
    }

}