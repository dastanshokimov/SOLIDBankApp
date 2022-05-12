package kz.jusan.demo;

public interface CLIUI extends CreateAccountOperationUI{

    public double requestClientAmount();
    public String requestClientAccountNumber();
    public AccountType requestAccountType();
}
