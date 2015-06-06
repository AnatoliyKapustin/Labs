package com.logistic.impl.model.Package;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;
import com.logistic.api.model.post.PackageType;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public class middleBoxUpsExpress extends BasePackage {
    public middleBoxUpsExpress(String id, int weight, PackageType Type, Address receiverAddress, Address senderAddress, FullName senderFullName, FullName receiverFullName) {
        super(id, weight, Type, receiverAddress, senderAddress, senderFullName, receiverFullName);
    }
}
