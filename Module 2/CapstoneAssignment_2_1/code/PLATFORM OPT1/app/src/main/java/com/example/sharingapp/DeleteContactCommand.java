package com.example.sharingapp;

import android.content.Context;

public class DeleteContactCommand extends Command{
    private ContactList contact_list;
    private Contact contact;
    private Context context;
    public DeleteContactCommand(ContactList contact_list, Contact contact, Context context) {
        this.contact_list = contact_list;
        this.contact = contact;
        this.context = context;
    }
    public void execute(){
        this.contact_list.deleteContact(this.contact);
        setIsExecuted(contact_list.saveContacts(context));
    }
}
