package com.logistic.impl.model.Person;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;
import com.logistic.api.model.person.Person;
import com.logistic.impl.model.BaseCharacter;
import com.logistic.impl.model.Package.BasePackage;
import com.logistic.api.model.person.Action;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public abstract class BasePerson implements Person {

    public FullNameImpl fullName;
    public  AddressImpl address;

    public BasePerson(FullNameImpl fullName, AddressImpl address){
        this.fullName = fullName;
        this.address = address;
    }

    public Address getAddress(){
        return this.address;
    }

    public FullName getFullName(){
        return  this.fullName;
    }

    public abstract Action getActionType();

    public void doAction(){

    }
    public class FullNameImpl implements FullName{

        public String firstName;
        public String middleName;
        public String lastName;

        FullNameImpl(String f, String m, String l){
            this.firstName = f;
            this.middleName = m;
            this.lastName = l;
        }

        @Override
        public String getFirstName() {
            return this.firstName;
        }

        @Override
        public String getLastName() {
            return this.middleName;
        }

        @Override
        public String getMiddleName() {
            return this.lastName;
        }
    }

    public class AddressImpl implements Address{

        public String street;
        public String city;
        public String country;
        public int code;

        AddressImpl(String street, String city, String country, int code){
            this.street = street;
            this.city = city;
            this.country = country;
            this.code = code;
        }

        @Override
        public String getStreet(){
            return this.street;
        }

        @Override
        public String getCity(){
            return city;
        }
        @Override
        public String getCountry(){
            return country;
        }

        @Override
        public int getCode(){
            return code;
        }
    }
}
