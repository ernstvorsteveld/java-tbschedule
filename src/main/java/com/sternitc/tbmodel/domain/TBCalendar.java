package com.sternitc.tbmodel.domain;

import java.util.Collection;

public class TBCalendar {

    public Collection<TB> get(TBPlanning planning) {
        if(planning == null) {
            throw new TBCalenderUsageException("pl");
        }
        return null;
    }

}
