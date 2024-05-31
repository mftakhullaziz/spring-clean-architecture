package com.app.clean_architecture.core.entities.account;

import com.app.clean_architecture.domain.account.AccountDto;

// This is entities, business logic related this entity
public interface AccountEntities {
    void RegisterAccountEntities(AccountDto accountDto);
}
