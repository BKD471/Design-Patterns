package creational.builder.dto.impl;

import creational.builder.dto.UserDto;
import creational.builder.dto.UserDtoBuilder;
import creational.builder.entity.Address;

import java.time.LocalDate;
import java.time.Period;

//the concerete builder
public class UserWebDtoBuilder implements UserDtoBuilder {

    private String firstName;
    private String lastName;
    private String address;
    private String age;

    private UserWebDto dto;
    /**
     * @param firstName
     * @return
     */
    @Override
    public UserDtoBuilder withFirstName(String firstName) {
        this.firstName=firstName;
        return this;
    }

    /**
     * @param lastName
     * @return
     */
    @Override
    public UserDtoBuilder withLastName(String lastName) {
        this.lastName=lastName;
        return this;
    }

    /**
     * @param birthDay
     * @return
     */
    @Override
    public UserDtoBuilder withBirthDay(LocalDate birthDay) {
        Period agep=Period.between(birthDay, LocalDate.now());
        this.age=String.valueOf(agep.getYears());
        return this;
    }

    /**
     * @param address
     * @return
     */
    @Override
    public UserDtoBuilder withAddress(Address address) {
        this.address=address.toString();
        return this;
    }

    /**
     * @return
     */
    @Override
    public UserDto build() {
        dto=new UserWebDto(firstName+""+lastName,address,age);
        return dto;
    }

    /**
     * @return
     */
    @Override
    public UserDto getUserDto() {
        return dto;
    }
}
