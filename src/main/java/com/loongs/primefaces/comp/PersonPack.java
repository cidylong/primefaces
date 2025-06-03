package com.loongs.primefaces.comp;

import java.io.Serializable;
import java.util.Objects;

public class PersonPack implements Serializable {
    private static final long serialVersionUID = 1L;
    private Person person;
    private Address address;

    public Person getPerson() {return person;}
    public void setPerson(Person person) {this.person = person;}
    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}

    public  PersonPack(Person person, Address address) {
        this.person = person;
        this.address = address;
    }
    public  PersonPack(Person person) {
        this.person = person;
    }
    public  PersonPack() {}
    public void updatePackByAddress(Address address) {
        if(person != null){
            if(person.getAddressId() == null || !person.getAddressId().equals(address.getId())){
                person.setAddressId(address.getId());
            }
        }
        this.address = address;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonPack that = (PersonPack) o;
        return Objects.equals(person, that.person) && Objects.equals(address, that.address);
    }
    @Override
    public int hashCode() {
        return Objects.hash(person, address);
    }
    @Override
    public String toString() {
        return "PersonPack{" +
                "person=" + person +
                ", address=" + address +
                '}';
    }
}
