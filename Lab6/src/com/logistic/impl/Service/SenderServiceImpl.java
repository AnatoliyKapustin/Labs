package com.logistic.impl.Service;

import com.logistic.api.model.post.*;
import com.logistic.api.model.post.Package;
import com.logistic.api.model.transport.Transit;
import com.logistic.api.service.SenderService;
import com.logistic.impl.model.PostOffice.BaseOffice;
import com.logistic.impl.model.PostOffice.officeOne;
import com.logistic.impl.model.PostOffice.officeTwo;

import java.util.Random;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public class SenderServiceImpl implements SenderService{
    public static final int MAX_OFFICES = 5;

    public void setCity() {

    }

    @Override
    public PostOffice[] getAllOffices() {
        Random r = new Random();
        PostOffice[] postOffices = new PostOffice[r.nextInt(MAX_OFFICES) + MAX_OFFICES];
        for (int i = 0; i < postOffices.length; i++) {
            PostOffice p;
            if (r.nextInt(2) == 0) {
                p = new officeOne(addr1,);
            } else {
                p = new officeTwo(r.nextInt(50) + 20, r.nextInt(20) + 5, r.nextInt(8) + 1);
            }
            postOffices[i] = p;
        }
        return  postOffices;
    }
    }

    @Override
    public Transit[] calculatePossibleTransits(com.logistic.api.model.post.Package parcel, PostOffice senderOffice) {
        return new Transit[0];
    }

    @Override
    public boolean sendPackage(Package parcel, Transit transit) {
        return false;
    }

    @Override
    public PostOffice getPackageCurrentPosition(String id) {
        return null;
    }

    @Override
    public double getMilesToDestination(String id) {
        return 0;
    }
}
