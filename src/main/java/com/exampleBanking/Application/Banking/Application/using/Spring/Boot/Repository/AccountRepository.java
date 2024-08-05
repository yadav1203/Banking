package com.exampleBanking.Application.Banking.Application.using.Spring.Boot.Repository;

import com.exampleBanking.Application.Banking.Application.using.Spring.Boot.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}