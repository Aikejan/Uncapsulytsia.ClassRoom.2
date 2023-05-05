public class Contact {
    private String contactNane;
    private int phoneNumber;
    public Contact(){

    }


    public Contact(String contactNane, int phoneNumber) {
        this.contactNane = contactNane;
        this.phoneNumber = phoneNumber;
    }

    public String getContactNane() {
        return contactNane;
    }

    public void setContactNane(String contactNane) {
        this.contactNane = contactNane;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\ncontactNane:" + contactNane +
                " phoneNumber: " + phoneNumber ;
    }
}
