package org.example.creational.builder.dto.impl;

import org.example.creational.builder.entity.Address;

import java.time.LocalDate;

//abstract builder
public interface UserDtoBuilder {
    UserDtoBuilder withFirstName(String firstName);
    UserDtoBuilder withLastName(String lastName);
    UserDtoBuilder withBirthDay(LocalDate birthDay);
    UserDtoBuilder withAddress(Address address);

    //method to assemble parts by parts
    UserDto build();
    //method to get complete product built so far
    UserDto  getUserDto();
}
