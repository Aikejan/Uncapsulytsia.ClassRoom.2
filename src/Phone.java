import java.util.Arrays;

public class Phone {
    private String brend;
    private  String model;
    private double price;
    private String  phoneUsersName;
    private Contact[] contacts;


    public Phone(){

    }

    public Phone(String brend, String model, double price, String phoneUsersName, Contact[] contacts) {
        this.brend = brend;
        this.model = model;
        this.price = price;
        this.phoneUsersName = phoneUsersName;
        this.contacts = contacts;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoneUsersName() {
        return phoneUsersName;
    }

    public void setPhoneUsersName(String phoneUsersName) {
        this.phoneUsersName = phoneUsersName;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }
    public  String getContactCount(){
        return this.phoneUsersName + " Contact cout is: " +contacts.length;
    }

    @Override
    public String toString() {
        return "brend: " + brend +
                "\n model: " + model +
                "\n price: " + price +
                "\n phoneUsersName: " + phoneUsersName +
                " contacts: " + Arrays.toString(contacts);
    }
}
