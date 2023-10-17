package org.example.creational.builder2.builder.impl;

import org.example.creational.builder2.builder.BirthDateBuilder;
import org.example.creational.builder2.builder.FirstNameBuilder;
import org.example.creational.builder2.builder.LastNameBuilder;
import org.example.creational.builder2.builder.PhoneNumberBuilder;
import org.example.creational.builder2.entity.Person;

import java.time.LocalDate;

public class PersonBuilder implements FirstNameBuilder, LastNameBuilder, BirthDateBuilder, PhoneNumberBuilder {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String phoneNumber;

    private PersonBuilder(){}

    public static FirstNameBuilder builder(){
        return new PersonBuilder();
    }
    /**
     * @param birthDate
     * @return
     */
    @Override
    public PhoneNumberBuilder withBirthDate(LocalDate birthDate) {
        this.birthDate=birthDate;
        return this;
    }

    /**
     * @param firstName
     * @return
     */
    @Override
    public LastNameBuilder withFirstName(String firstName) {
        this.firstName=firstName;
        return this;
    }

    /**
     * @param lastName
     * @return
     */
    @Override
    public BirthDateBuilder withLastName(String lastName) {
        this.lastName=lastName;
        return this;
    }

    /**
     * @param phoneNumber
     * @return
     */
    @Override
    public PhoneNumberBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
        return this;
    }

    /**
     * @return
     */
    @Override
    public Person build() {
        Person p=new Person();
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setBirthDate(birthDate);
        p.setPhoneNumber(phoneNumber);
        return p;
    }
}
