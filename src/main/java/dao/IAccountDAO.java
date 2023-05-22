package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Account;

/**
* @author  Mahjoub Messaoui
* @version 1.0
* 
*/

public interface IAccountDAO extends JpaRepository<Account, Long> {}