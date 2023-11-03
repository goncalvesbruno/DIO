import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) throws Exception {
        
        ContaTerminal conta = new ContaTerminal();

        imprimeConta(conta);
        
    }

    public ContaTerminal() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, insira o número da agência com dígito: ");
        setAgencia(scan.nextLine());
        
        System.out.println("Por favor, insira o número da conta com dígito: ");
        setNumero(Integer.valueOf(scan.nextLine()));

        System.out.println("Por favor, insira o nome completo do cliente: ");
        setNomeCliente(scan.nextLine());

        System.out.println("Por favor, insira o saldo da conta: ");
        setSaldo(Double.valueOf(scan.nextLine()));
    }

    public static void imprimeConta(ContaTerminal conta){
        System.out.println ("Conta criada com sucesso: ");
        System.out.println("Agencia: "+ conta.getAgencia());
        System.out.println("Conta: "+ conta.getNumero());
        System.out.println("Nome do cliente: "+ conta.getNomeCliente());
        System.out.println("Saldo: "+ conta.getSaldo());
    }

// Getters e setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

}
