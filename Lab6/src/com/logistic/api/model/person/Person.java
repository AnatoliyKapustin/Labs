package com.logistic.api.model.person;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public interface Person {
    public Address getAddress();
    public FullName getFullName();
}
