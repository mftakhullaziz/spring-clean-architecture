package com.app.springcleanarch.core.usecase.account;

import com.app.springcleanarch.domain.account.AccountResponse;

public interface OAccountBoundary {
    void presenter(AccountResponse accountResponse);
}
