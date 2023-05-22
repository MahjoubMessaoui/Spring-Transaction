package service;

import java.util.List;
import java.util.Optional;

import model.Account;

/**
 * @author Mahjoub Messaoui
 * @version 1.0
 * 
 * 
 */


public interface IAccountService {
    void addAccount(Account account);
    List<Account> getAllAccounts();
    void transferMoney(Account from, Account to, double amount, double fee);
	Optional<Account> getAccount(int accountId);
}
