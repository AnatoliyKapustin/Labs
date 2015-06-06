package com.logistic.impl.model.Person;

import com.logistic.api.model.person.Action;

/**
 * Created by AnatoliyKapustin on 06.06.2015.
 */
public class receiver extends BasePerson {

    public receiver(FullNameImpl fullName, AddressImpl address) {
        super(fullName, address);
    }
    @Override
    public Action getActionType() {
        return Action.RECEIVER;
    }
}
