public class ContaBancaria {
    private String nome;
    private String numeroConta;
    private double money;

    public ContaBancaria(String nome, String numeroConta, double money){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.money = money;
    }

    public void depositar(double moneyOperation){
        if(moneyOperation > 0){
            money += moneyOperation;
            System.out.println("Depósito no valor de "+moneyOperation+" Realizado com sucesso!");
            System.out.println("Saldo Atual: "+money);
        }
        else{
            System.out.println("Depósito inválido!!!");
        }
    }

    public void sacar(double moneyOperation){
        if(moneyOperation > 0 && moneyOperation <= money){
            money -= moneyOperation;
            System.out.println("Saque no valor de "+moneyOperation+" Realizado com sucesso!");
            System.out.println("Saldo Atual: "+money);
        }
        else{
            System.out.println("Saque inválido!!!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Nome do responsável pela conta bancária: "+nome);
        System.out.println("Nº da Conta: "+numeroConta);
        System.out.println("Saldo Atual: "+money);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
