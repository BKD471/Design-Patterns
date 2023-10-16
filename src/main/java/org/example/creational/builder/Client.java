package org.example.creational.builder;

import org.example.creational.builder.dto.impl.UserDto;
import org.example.creational.builder.dto.impl.UserDtoBuilder;
import org.example.creational.builder.dto.impl.UserWebDto;
import org.example.creational.builder.dto.impl.UserWebDtoBuilder;
import org.example.creational.builder.entity.Address;
import org.example.creational.builder.entity.User;

import javax.xml.stream.events.DTD;
import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
         User user=createUser();
         UserDtoBuilder builder=new UserWebDtoBuilder();
         UserDto dto=build(builder,user);
        System.out.println(dto);
    }

    private static UserDto build(UserDtoBuilder builder, User user){
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthDay(user.getBirthDay()).build();
    }
    public static User createUser(){
        User user = new User();
        user.setBirthDay(LocalDate.of(1997, 12, 1));
        user.setFirstName("Phoenix");
        user.setLastName("Phoenix");
        Address address = new Address();
        address.setHouseNumber("69");
        address.setStreet("69 Street");
        address.setCity("Chandernagore");
        address.setState("WB");
        address.setZipCode("712136");
        user.setAddress(address);
        return user;
    }
}
