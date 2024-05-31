package com.app.springcleanarch.infrastructure.mysql.gateway.impl;

import com.app.springcleanarch.application.stereotype.Gateway;
import com.app.springcleanarch.infrastructure.mysql.gateway.AccountJpaGateway;
import com.app.springcleanarch.infrastructure.mysql.persistence.AccountPersistence;
import com.app.springcleanarch.infrastructure.mysql.repository.AccountRepository;

@Gateway
public class AccountJpaGatewayImpl implements AccountJpaGateway {

    private final AccountRepository accountRepository;

    public AccountJpaGatewayImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public boolean findUsernameIsExist(String username) {
        return accountRepository.existsByUsername(username);
    }

    @Override
    public boolean findEmailIsExist(String email) {
        return accountRepository.existsByEmail(email);
    }

    @Override
    public void saveToAccountPersistence(AccountPersistence accountPersistence) {
        accountRepository.save(accountPersistence);
    }

}
