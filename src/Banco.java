public class Banco{

    private int idConta;
    private String nome;
    private double saldo;
    public double juros = 5.00;

    public Banco(int idConta, String nome) {

        this.idConta = idConta;
        this.nome = nome;
    }

    public Banco (int idConta, String nome, double depositoInicial) {

        this.idConta = idConta;
        this.nome = nome;
        Deposito(depositoInicial);
    }

    public int getIdConta() {
        return idConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Deposito(double deposito){

        saldo += deposito;
    }

    public void saque(double saque) {

        saldo -= saque + 5.00;
    }

    public String toString(){

        return "conta: "
                + idConta
                + ", nome: "
                + nome
                + ", saldo: $"
                + saldo;
    }
}