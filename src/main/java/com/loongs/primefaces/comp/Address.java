package com.loongs.primefaces.comp;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String referId;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getReferId() {return referId;}
    public void setReferId(String referId) {this.referId = referId;}
    public String getStreet() {return street;}
    public void setStreet(String street) {this.street = street;}
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
    public String getState() {return state;}
    public void setState(String state) {this.state = state;}
    public String getZip() {return zip;}
    public void setZip(String zip) {this.zip = zip;}
    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}

    public Address() {}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(referId, address.referId) && Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(state, address.state)
                && Objects.equals(zip, address.zip) && Objects.equals(country, address.country);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, referId, street, city, state, zip, country);
    }
}
