package com.app.springcleanarch.infrastructure.mysql.gateway;

import com.app.springcleanarch.infrastructure.mysql.persistence.AccountPersistence;

public interface AccountJpaGateway {
    boolean findUsernameIsExist(String username);
    boolean findEmailIsExist(String email);
    void saveToAccountPersistence(AccountPersistence accountPersistence);
}
