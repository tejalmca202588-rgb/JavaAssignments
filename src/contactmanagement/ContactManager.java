package contactmanagement;

import java.io.*;
import java.util.ArrayList;

public class ContactManager {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact Added Successfully!");
    }

    public Contact searchContact(String name) {

        for (Contact contact : contacts) {

            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }

        }

        return null;
    }

    public void updateContact(String name, String newPhone) {

        Contact contact = searchContact(name);

        if (contact != null) {

            contact.setPhone(newPhone);

            System.out.println("Contact Updated Successfully!");

        } else {

            System.out.println("Contact Not Found.");

        }

    }

    public void deleteContact(String name) {

        Contact contact = searchContact(name);

        if (contact != null) {

            contacts.remove(contact);

            System.out.println("Contact Deleted Successfully!");

        } else {

            System.out.println("Contact Not Found.");

        }

    }

    public void displayContacts() {

        if (contacts.isEmpty()) {

            System.out.println("No Contacts Found.");
            return;

        }

        for (Contact contact : contacts) {

            System.out.println("--------------------");
            System.out.println(contact);

        }

    }

    public void saveContacts() {

        try {

            FileWriter fw = new FileWriter("contacts.txt");

            for (Contact contact : contacts) {

                fw.write(contact.getName() + "," + contact.getPhone() + "\n");

            }

            fw.close();

            System.out.println("Contacts Saved Successfully!");

        } catch (IOException e) {

            System.out.println("Error Saving File.");

        }

    }

    public void loadContacts() {

        try {

            File file = new File("contacts.txt");

            if (!file.exists()) {

                System.out.println("No Saved File Found.");
                return;

            }

            contacts.clear();

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                contacts.add(new Contact(data[0], data[1]));

            }

            br.close();

            System.out.println("Contacts Loaded Successfully!");

        } catch (Exception e) {

            System.out.println("Error Loading File.");

        }

    }
}