package com.app.clean_architecture.core.usecase.account;

import com.app.clean_architecture.application.stereotype.Usecase;
import com.app.clean_architecture.core.entities.account.AccountEntities;
import com.app.clean_architecture.domain.account.AccountDto;
import com.app.clean_architecture.domain.account.AccountRequest;

@Usecase
public class AccountUsecase implements IAccountBoundary {

    private final AccountEntities accountEntities;

    public AccountUsecase(AccountEntities accountEntities) {
        this.accountEntities = accountEntities;
    }

    @Override
    public void createAccount(AccountRequest request, OAccountBoundary oAccountBoundary) {
        accountEntities.RegisterAccountEntities(new AccountDto());
    }
}
