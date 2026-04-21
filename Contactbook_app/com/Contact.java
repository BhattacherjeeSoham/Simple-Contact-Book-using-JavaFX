package Contactbook_app.com;

public class Contact {
    String name, phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
}