package org.example.creational.builder2.builder;

import java.time.LocalDate;

public interface BirthDateBuilder {
    PhoneNumberBuilder withBirthDate(LocalDate birthDate);
}
