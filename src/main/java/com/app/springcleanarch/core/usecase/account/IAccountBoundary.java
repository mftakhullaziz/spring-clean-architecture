package com.app.springcleanarch.core.usecase.account;

import com.app.springcleanarch.domain.account.AccountRequest;

public interface IAccountBoundary {
    void createAccount(AccountRequest request, OAccountBoundary oAccountBoundary);
}
