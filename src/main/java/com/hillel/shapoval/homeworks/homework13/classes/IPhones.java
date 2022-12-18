package com.hillel.shapoval.homeworks.homework13.classes;

import com.hillel.shapoval.homeworks.homework13.interfaces.IOS;
import com.hillel.shapoval.homeworks.homework13.interfaces.Smartphones;

public class IPhones extends Phone implements Smartphones, IOS {

    public IPhones(String phone) {
        super(phone);
    }

    @Override
    public void call() {
        System.out.println(getPhone() + " can call");
    }

    @Override
    public void sms() {
        System.out.println(getPhone() + " send sms");
    }

    @Override
    public void internet() {
        System.out.println(getPhone() + " have internet");
    }

    @Override
    public void iOS() {
        System.out.println(getPhone() + " have iOS");
    }
}
