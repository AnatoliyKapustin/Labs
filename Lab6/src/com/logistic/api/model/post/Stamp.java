package com.logistic.api.model.post;

import com.logistic.api.model.person.Address;

import java.util.Date;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public interface Stamp {
    public Address getPostOfficeAddress();
    public Date getStampDate();
}
