package com.logistic.impl.model.Person;

import com.logistic.api.model.person.Action;
import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public class sender extends BasePerson {
    public sender(FullNameImpl fullName, AddressImpl address) {
        super(fullName, address);
    }
    @Override
    public Action getActionType() {
        return Action.SENDER;
    }
}
