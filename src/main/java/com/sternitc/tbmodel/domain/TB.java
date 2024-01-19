package com.sternitc.tbmodel.domain;

public class TB {

    private final Account account;
    private TBPlanning planning;

    public TB(Account account, TBPlanning planning) {
        if(planning == null) {
            throw new TBTBPlanningEmptyException();
        }
        if(account == null) {
            throw new TBAccountEmptyException();
        }
        this.account = account;
        this.planning = planning;
    }

    public void scheduleAt(TBPlanning planning) {
        if(planning == null) {
            throw new TBTBPlanningEmptyException();
        }
        this.planning = planning;
    }

    public boolean isAt(TBPlanning planning) {
        return false;
    }
}
