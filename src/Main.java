import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      /*  Person person = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fullname");
        String name = sc.nextLine();
        person.setFullName(name);
        System.out.println("Inter your age");
        int age = sc.nextInt();
        person.setAge(age);
        System.out.println("Inter your email");
        String email = sc.nextLine();
        person.setEmsill(sc.nextLine());
        Scanner scan = new Scanner(System.in);
        System.out.println("Inter your salary");
        int salary = sc.nextInt();
        person.setSalary(scan.nextInt());*/



        Contact contact = new Contact("Aikezhan",998-12-37-77);
        Contact contact1 = new Contact("Alina",555-52-89-77);
        Contact contact2 = new Contact("Aikezhan",554-92-57-77);
        Contact [] contacts = {contact,contact1, contact2};

        Phone phone = new Phone("Apple", "Iphone", 1200, "Ulan Datka", contacts);
        Phone phone1 = new Phone("Samsung", "Galaxy30",1700,"Aijamal eje", new  Contact[2]);

            Phone[] phones = {phone, phone1};

        for (int i = 0; i < contacts.length; i++) {
            System.out.println(phones[i].getContactCount());

        }





     /// TODO SET AND GET VALUE ///
       /* Contact contact = new Contact();
        contact.setContactNane("Aikezhan");
        contact.setPhoneNumber(998 - 02 - 07 - 77);


        Contact contact1 = new Contact();
        contact1.setContactNane("Anara");
        contact1.setPhoneNumber(554 - 56 - 76 - 89);


        Contact contact2 = new Contact();
        contact2.setContactNane("Savat");
        contact2.setPhoneNumber(555 - 89 - 65 - 43);

        Contact[] contacts4 = {contact, contact1, contact2};

        System.out.println(contact.getContactNane() +"\n" +contact.getPhoneNumber() +"\n" +
                contacts4.length + contact1.getContactNane() + "\n" + contact1.getPhoneNumber() + "\n" +
                contacts4.length + contact2.getContactNane() + "\n" + contact2.getPhoneNumber() +
                " \n " + contacts4.length);

        Phone phone = new Phone();
        phone.setBrend("Apple");
        phone.setModel("Iphone14");
        phone.setPrice(1300);
        phone.setPhoneUsersName("Datka");


        Phone phone1 = new Phone();
        phone1.setBrend("Sony");
        phone1.setModel("Sony Erikson");
        phone1.setPrice(600);
        phone1.setPhoneUsersName("Aikezhan");
        Phone[] phone2 = {phone, phone1};
        System.out.println(phone1.getBrend() + "\n" +phone1.getPrice() + "\n" + phone1 + phone1.getModel() + "\n" +
                phone1.getPhoneUsersName() + "\n" +phone2.length + "\n" + phone.getModel() + "\n" + phone.getBrend() + '\n' +
                phone.getPrice() + "\n" +phone.getPhoneUsersName() + "\n" + phone2.length);


        }*/



    }
    }
