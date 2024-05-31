package com.app.clean_architecture.infrastructure.mysql.gateway;

import com.app.clean_architecture.infrastructure.mysql.persistence.AccountPersistence;

public interface AccountJpaGateway {
    boolean findUsernameIsExist(String username);
    boolean findEmailIsExist(String email);
    void saveToAccountPersistence(AccountPersistence accountPersistence);
}
