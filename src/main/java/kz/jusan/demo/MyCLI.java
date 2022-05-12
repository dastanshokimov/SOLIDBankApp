package kz.jusan.demo;

import java.util.Scanner;

public class MyCLI implements CLIUI{

    private Scanner scanner;

    public MyCLI() {
        scanner = new Scanner(System.in);
    }

    public MyCLI(Scanner scanner){
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public double requestClientAmount(){
        return 0;
    }

    public String requestClientAccountNumber(){
        return null;
    }

    public AccountType requestAccountType(){
        System.out.println("Please, choose account type:");
        System.out.println("[CHECKING, SAVING, FIXED]");
        String accountTypeValue = scanner.nextLine();
        return new AccountType(accountTypeValue);
    }
}
