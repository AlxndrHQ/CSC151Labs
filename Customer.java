public class Customer {
    private String name = null;
    private String address = null;
    private String phone = null;

    public void Customer() {
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setPhone(String p) {
        phone = p;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}