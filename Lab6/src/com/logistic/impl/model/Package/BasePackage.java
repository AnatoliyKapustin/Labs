package com.logistic.impl.model.Package;


import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;
import com.logistic.api.model.post.PackageType;
import com.logistic.api.model.post.PostOffice;
import com.logistic.impl.model.PostOffice.BaseOffice;

import java.awt.*;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public abstract class BasePackage implements com.logistic.api.model.post.Package {
    public String id;
    public int weight;
    public PackageType Type;
    public PackageAddressImpl receiverAddress;
    public PackageAddressImpl senderAddress;
    public PackageFullNameImpl senderFullName;
    public FullName receiverFullName;

    private Point coordinates;

    public BasePackage(String id, int weight, PackageType Type, PackageAddressImpl receiverAddress, PackageAddressImpl senderAddress,
                       PackageFullNameImpl senderFullName, PackageFullNameImpl receiverFullName){
        this.id = id;
        this.weight = weight;
        this.Type = Type;
        this.receiverAddress = receiverAddress;
        this.senderAddress = senderAddress;
        this.senderFullName = senderFullName;
        this.receiverFullName = receiverFullName;
    }

    public String getPackageId(){
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public PackageType getType(){
        return Type;
    }

    public Address getReceiverAddress(){
        return receiverAddress;
    }

    public Address getSenderAddress(){
        return senderAddress;
    }

    public FullName getSenderFullName(){
        return senderFullName;
    }

    public FullName getReceiverFullName(){
        return receiverFullName;
    }

    public class PackageFullNameImpl implements FullName{

        public String firstName;
        public String middleName;
        public String lastName;

        PackageFullNameImpl(String f, String m, String l){
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

    public class PackageAddressImpl implements Address{

        public String street;
        public String city;
        public String country;
        public int code;

        PackageAddressImpl(String street, String city, String country, int code){
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
