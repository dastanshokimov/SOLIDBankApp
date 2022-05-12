package kz.jusan.demo;

public class AccountCreationServiceImpl implements AccountCreationService{

    private AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        String id = String.format("%03d%06d", bankID, accountID);
        Account account = new Account(accountType, id, clientID,0, false);

        System.out.println("Bank account has been created successfully.");
        accountDAO.createNewAccount(account);
    }
}
