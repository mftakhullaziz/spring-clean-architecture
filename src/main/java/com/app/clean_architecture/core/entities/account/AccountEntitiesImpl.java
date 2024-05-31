package com.app.clean_architecture.core.entities.account;

import com.app.clean_architecture.application.stereotype.EntitiesBusiness;
import com.app.clean_architecture.domain.account.AccountDto;
import com.app.clean_architecture.infrastructure.mysql.gateway.AccountJpaGateway;
import com.app.clean_architecture.infrastructure.mysql.persistence.AccountPersistence;
import lombok.extern.log4j.Log4j2;

@Log4j2
@EntitiesBusiness
public class AccountEntitiesImpl implements AccountEntities {

    private final AccountJpaGateway accountJPAGateway;

    public AccountEntitiesImpl(AccountJpaGateway accountJPAGateway) {
        this.accountJPAGateway = accountJPAGateway;
    }

    @Override
    public void RegisterAccountEntities(AccountDto accountDto) {
        if (accountDto != null) {
            // validate email and username is unique
            boolean emailExist = accountJPAGateway.findEmailIsExist(accountDto.getEmail());
            boolean usernameIsExist = accountJPAGateway.findUsernameIsExist(accountDto.getUsername());
            if (!emailExist || !usernameIsExist) {
                log.info("Account with email {} and username {} already exists", accountDto.getEmail(), accountDto.getUsername());
            }
            AccountPersistence accountPersistence = AccountPersistence.builder()
                .email(accountDto.getEmail())
                .username(accountDto.getUsername())
                .password(accountDto.getPassword())
                .build();
            accountJPAGateway.saveToAccountPersistence(accountPersistence);
        }
    }
}
