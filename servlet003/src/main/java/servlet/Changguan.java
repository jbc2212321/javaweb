package servlet;

public class Changguan {
    private int count;
    private String cgName;
    private String userName;
    private String phone;
    private String address;
    private String descAddress;

    public Changguan(int count, String cgName, String userName, String phone, String address, String descAddress) {
        this.count = count;
        this.cgName = cgName;
        this.userName = userName;
        this.phone = phone;
        this.address = address;
        this.descAddress = descAddress;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCgName() {
        return cgName;
    }

    public void setCgName(String cgName) {
        this.cgName = cgName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    @Override
    public String toString() {
        return "Changguan{" +
                "count=" + count +
                ", cgName='" + cgName + '\'' +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", descAddress='" + descAddress + '\'' +
                '}';
    }
}
