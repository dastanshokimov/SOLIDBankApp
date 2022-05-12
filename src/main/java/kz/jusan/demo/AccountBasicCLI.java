package kz.jusan.demo;

import java.util.List;

public class AccountBasicCLI {

    private CreateAccountOperationUI createAccountOperationUI;
    private BankCore bankCore;
    private AccountListingService accountListing;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListing){
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListing = accountListing;
    }

    public void createAccountRequest(String clientID){
        AccountType accountType = createAccountOperationUI.requestAccountType();
        bankCore.createNewAccount(accountType, clientID);
    }

    public void getAccounts(String clientID){
        List<Account> accountList = this.accountListing.getClientAccounts(clientID);
        System.out.print("[");
        for(Account account: accountList){
            System.out.print(account);
        }
        System.out.println("]");
    }
}
