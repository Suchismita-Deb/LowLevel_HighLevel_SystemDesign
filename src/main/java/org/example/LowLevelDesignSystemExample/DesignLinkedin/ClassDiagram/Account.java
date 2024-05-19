package org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram;

import org.example.LowLevelDesignSystemExample.DesignLinkedin.ClassDiagram.Utility.AccountStatus;

public abstract class Account {

    private String accountId;
    private String password;
    private String username;
    private String email;
    AccountStatus status;

    public abstract boolean resetPassword();
}
