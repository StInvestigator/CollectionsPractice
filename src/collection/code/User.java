package collection.code;

public class User {
    private final String name;
    private int old;
    private String phoneNumber;

    public User(String name, int old, String phoneNumber) {
        this.name = name;
        this.old = old;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "{Name : " + name + ", Old : " + old + ", Phone : " + phoneNumber + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof User user) {
            return name.equals(user.name) && old == user.old && phoneNumber.equals(user.phoneNumber);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + old + phoneNumber.hashCode();
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
