package com.loongs.primefaces.comp;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String firstName;
    private String lastName;
    private String addressId;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getAddressId() {return addressId;}
    public void setAddressId(String addressId) {this.addressId = addressId;}

    public Person() {}
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(addressId, person.addressId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, addressId);
    }
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addressId='" + addressId + '\'' +
                '}';
    }
}
