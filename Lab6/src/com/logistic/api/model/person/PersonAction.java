package com.logistic.api.model.person;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public interface PersonAction {
    void doAction();
    Person getActionTarget();
}
