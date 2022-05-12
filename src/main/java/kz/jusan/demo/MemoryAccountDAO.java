package kz.jusan.demo;

import java.util.ArrayList;
import java.util.List;

public class MemoryAccountDAO implements AccountDAO {

    public MemoryAccountDAO(List<Account> accountList) {
        this.accountList = accountList;
    }

    public MemoryAccountDAO() {
        accountList = new ArrayList<>();
    }

    private List<Account> accountList;

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        for(Account account:accountList){
            if(account.getId().equals(accountID))
                return account;
        }
        return null;
    }
}
