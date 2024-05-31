package com.app.clean_architecture.core.usecase.account;

import com.app.clean_architecture.domain.account.AccountResponse;

public interface OAccountBoundary {
    void presenter(AccountResponse accountResponse);
}
