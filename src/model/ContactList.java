package model;

import java.util.ArrayList;

/**
 * Created by katayama on 2018/10/27.
 */
public class ContactList {
    private ArrayList<Contact> contactList = new ArrayList<>();

    public ContactList() {

    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }


    public void printList() {
        for(Contact contact : contactList) {
            System.out.println(contact.getId());
            System.out.println("-----------------------------");
            System.out.println("Name: " + contact.getUserName());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("Cellphone: " + contact.getCellphone());
            System.out.println("Address: " + contact.getAddress());
            System.out.println("                            ");
        }
    }
}