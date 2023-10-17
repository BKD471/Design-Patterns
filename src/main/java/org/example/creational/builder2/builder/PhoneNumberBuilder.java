package org.example.creational.builder2.builder;

import org.example.creational.builder2.entity.Person;

public interface PhoneNumberBuilder {
    PhoneNumberBuilder withPhoneNumber(String phoneNumber);
    Person build();
}
