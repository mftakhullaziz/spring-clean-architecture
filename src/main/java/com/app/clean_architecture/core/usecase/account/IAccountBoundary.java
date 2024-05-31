package com.app.clean_architecture.core.usecase.account;

import com.app.clean_architecture.domain.account.AccountRequest;

public interface IAccountBoundary {
    void createAccount(AccountRequest request, OAccountBoundary oAccountBoundary);
}
