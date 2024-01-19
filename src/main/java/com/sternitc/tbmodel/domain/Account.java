package com.sternitc.tbmodel.domain;

public class Account {

    private String accountValue;

    public Account(String accountValue) {
        if(accountValue == null|| accountValue.equalsIgnoreCase("")) {
            throw new AccountAccountValueEmptyException();
        }
        this.accountValue = accountValue;
    }

    public String getAccountValue() {
        return accountValue;
    }

    public void setValue(String accountValue) {
        this.accountValue = accountValue;
    }

    public boolean isSameAccount(Account account) {
        return accountValue.equals(account.getAccountValue());
    }
}
