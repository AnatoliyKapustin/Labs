package com.logistic.impl.model.Package;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;
import com.logistic.api.model.post.PackageType;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public class boxUps25 extends BasePackage {
    public boxUps25(String id, int weight, PackageType Type, PackageAddressImpl receiverAddress, PackageAddressImpl senderAddress, PackageFullNameImpl senderFullName, PackageFullNameImpl receiverFullName) {
        super(id, weight, Type, receiverAddress, senderAddress, senderFullName, receiverFullName);
    }
}
