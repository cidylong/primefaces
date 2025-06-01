package com.loongs.primefaces.comp;

import java.io.Serializable;

public class PersonContext implements Serializable {
    private static final long serialVersionUID = 1L;
    private PersonPack personPack;
    private Address editingAddress;

    public PersonPack getPersonPack() {return personPack;}
    public void setPersonPack(PersonPack personPack) {this.personPack = personPack;}
    public Address getEditingAddress() {return editingAddress;}
    public void setEditingAddress(Address editingAddress) {this.editingAddress = editingAddress;}

    public PersonContext(PersonPack personPack, Address editingAddress) {
        this.personPack = personPack;
        this.editingAddress = editingAddress;
    }
    public PersonContext() {}
    public PersonContext(PersonPack personPack) {
        this.personPack = personPack;
    }
}
