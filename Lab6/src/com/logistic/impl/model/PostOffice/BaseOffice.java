package com.logistic.impl.model.PostOffice;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.post.*;
import com.logistic.api.model.post.Package;

import java.awt.*;
import java.util.Date;

/**
 * Created by AnatoliyKapustin on 06.06.2015.
 */
public class BaseOffice implements PostOffice {
    public OfficeAddress officeAddr;
    public OfficeStamp officeStamp;
    public int maxWeight;
    public Point coordinates;

    public BaseOffice(OfficeAddress addr, OfficeStamp stamp, int weight, Point p1){
        this.officeAddr = addr;
        this.officeStamp = stamp;
        this.maxWeight = weight;
        this.coordinates = p1;
    }

    public void setOfficeCity(String city){
        officeAddr.city = city;
    }
    @Override
    public Stamp getStamp() {
        return officeStamp;
    }

    @Override
    public Address getAddress() {
        return officeAddr;
    }

    @Override
    public PackageType getAcceptableTypes() {
        return PackageType.T_10;
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public boolean sendPackage(com.logistic.api.model.post.Package parcel) {
        return Package.class.isAssignableFrom(parcel.getClass());
    }

    @Override
    public boolean receivePackage(Package parcel) {
        return false;
    }

    @Override
    public int getCode() {
        return officeAddr.getCode();
    }

    @Override
    public Point getGeolocation() {
        return this.coordinates;
    }
    public final void moveTo(Point point) {
        this.coordinates = point;
    }

    public final boolean canMoveTo(int weight) {
        if(this.maxWeight <= this.getMaxWeight()) {
            return true;
        } else {
            return false;
        }
    }


    public class OfficeAddress implements Address{
        public String street;
        public String city;
        public String country;
        public int code;

        OfficeAddress(String street, String city, String country, int code){
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

    public class OfficeStamp implements Stamp{
        public Address postOfficeAddr;
        public Date stampDate;

        public OfficeStamp(Address addr, Date d){
            this.postOfficeAddr = addr;
            this.stampDate = d;
        }

        @Override
        public Address getPostOfficeAddress() {
            return postOfficeAddr;
        }

        @Override
        public Date getStampDate() {
            return stampDate;
        }
    }
}
