package com.logistic.api.model.post;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public interface Package {
    public String getPackageId();
    public int getWeight();
    public PackageType getType();
    public Address getReceiverAddress();
    public Address getSenderAddress();
    public FullName getSenderFullName();
    public FullName getReceiverFullName();

    /**
     * http://www.ups.com/worldshiphelp/WS15/RUS/AppHelp/Codes/Package_Type_Codes.htm
     */
}
