package com.logistic.impl.model.PostOffice;

import java.awt.*;

/**
 * Created by AnatoliyKapustin on 06.06.2015.
 */
public class officeOne extends BaseOffice {
    OfficeAddress address = new OfficeAddress("1","1","1",1);
    OfficeStamp stamp = new OfficeStamp(address,)

    public officeOne(OfficeAddress address, OfficeStamp stamp, int weight, Point p1) {
        super(address, stamp, weight, p1);
    }
}
