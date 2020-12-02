package servlet;

import java.util.ArrayList;
import java.util.List;

public class ChangguanMgr {
    private String cgName;
    private String phone;
    private String userName;
    private String address;
    private String descAddress;
    private String desc;
    private static int count=0;
    private static List<Changguan>changguanList =new ArrayList<Changguan>();
    public static List<Changguan>edit(List<Changguan> changguans,int count,Changguan edit_changguan){
        for (Changguan changguan:changguans){
            if (changguan.getCount()==count){
                changguan.setCgName(edit_changguan.getCgName());
                changguan.setPhone(edit_changguan.getPhone());
                changguan.setAddress(edit_changguan.getAddress());
                changguan.setDescAddress(edit_changguan.getDescAddress());
            }
        }
        return changguans;
    }
    public ChangguanMgr(String cgName, String phone, String userName, String address, String descAddress) {
        this.cgName = cgName;
        this.phone = phone;
        this.userName = userName;
        this.address = address;
        this.descAddress = descAddress;
    }

    public ChangguanMgr(String cgName, String phone, String userName, String address, String descAddress, String desc) {
        this.cgName = cgName;
        this.phone = phone;
        this.userName = userName;
        this.address = address;
        this.descAddress = descAddress;
        this.desc = desc;
    }

    public String getCgName() {
        return cgName;
    }

    public void setCgName(String cgName) {
        this.cgName = cgName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescAddress() {
        return descAddress;
    }

    public void setDescAddress(String descAddress) {
        this.descAddress = descAddress;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ChangguanMgr{" +
                "cgName='" + cgName + '\'' +
                ", phone='" + phone + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", descAddress='" + descAddress + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
