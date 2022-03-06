package com.data;

public class Address {
    public String doorNo;
    public String village;
    public String district;

    public Address(String doorNo, String village, String district) {
        this.doorNo = doorNo;
        this.village = village;
        this.district = district;
    }

    public String toString(){
        return "DoorNo :" + doorNo + "  Village :" + village + "  District :" + district;
    }
}
