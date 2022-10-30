package com.ramana.accounts.repositories;

import com.ramana.accounts.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByCustomerId(Long customerId);
}
