package creational.builder2.builder;

import creational.builder2.entity.Person;

public interface PhoneNumberBuilder {
    PhoneNumberBuilder withPhoneNumber(String phoneNumber);
    Person build();
}
