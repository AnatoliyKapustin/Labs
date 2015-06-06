package com.logistic.impl.model;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public abstract class BaseCharacter implements com.logistic.api.model.person.Address, com.logistic.api.model.person.FullName{
    protected String firstName;
    protected  String middleName;
    protected  String lastName;
    protected  String street;
    protected  String city;
    protected  String country;
    protected  int code;



    public String getFirstName(){
        return(firstName);
    }

    public String getMiddleName(){
        return  middleName;
    }

    public String getLastName(){
        return  lastName;
    }

    public String getStreet(){
        return (street);
    }

    public String getCity(){
        return (city);
    }

    public String getCountry(){
        return (country);
    }

    public int getCode(){
        return (code);
    }
}
