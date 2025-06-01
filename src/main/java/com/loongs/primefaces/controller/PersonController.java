package com.loongs.primefaces.controller;

import com.loongs.primefaces.comp.Address;
import com.loongs.primefaces.comp.Person;
import com.loongs.primefaces.comp.PersonContext;
import com.loongs.primefaces.comp.PersonPack;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.logging.Logger;

@Named(value = "personController")
@SessionScoped
public class PersonController implements Serializable {
    private static final Logger logger = Logger.getLogger(PersonController.class.getName());
    private static final long serialVersionUID = 0L;
    private static String VIEW_PERSON = "/person/personView.xhtml";
    private static String EDIT_PERSON = "/person/personEdit.xhtml";
    private static String TV_PERSON_ADDRESS_EDIT = "/person/tvPersonAddressEdit.xhtml";
    private Integer activeIndex;
    private PersonContext personContext;

    public PersonContext getPersonContext() {return personContext;}
    public void setPersonContext(PersonContext personContext) {this.personContext = personContext;}
    public Integer getActiveIndex() {return activeIndex;}
    public void setActiveIndex(Integer activeIndex) {this.activeIndex = activeIndex;}

    public PersonController() {}

    public String createPerson(){
        logger.info("PersonController.createPerson()");
        Person person = new Person();
        person.setId("PRSN1");
        PersonPack personPack = new PersonPack(person);
        personContext = new PersonContext(personPack);
        return EDIT_PERSON;
    }
    public String createAddressFromPerson(){
        if(personContext.getPersonPack().getPerson() != null){
            Address address = new Address();
            address.setId("ADDRS1");
            address.setReferId(personContext.getPersonPack().getPerson().getId());
            personContext.setEditingAddress(address);
            activeIndex = 1;
        }
        return TV_PERSON_ADDRESS_EDIT;
    }
    public String saveAddressToPack(){
        if(personContext.getEditingAddress() != null){
            personContext.getPersonPack().updatePackByAddress(personContext.getEditingAddress());
            personContext.setEditingAddress(null);
        }
        return EDIT_PERSON;
    }
}