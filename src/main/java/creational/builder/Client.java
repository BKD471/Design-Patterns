package creational.builder;


import creational.builder.dto.UserDto;
import creational.builder.dto.UserDtoBuilder;
import creational.builder.dto.impl.UserWebDtoBuilder;
import creational.builder.entity.Address;
import creational.builder.entity.User;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
         User user=createUser();
         UserDtoBuilder builder=new UserWebDtoBuilder();
         UserDto dto=new UserWebDtoBuilder()
                 .withFirstName(user.getFirstName())
                 .withLastName(user.getLastName())
                 .withBirthDay(user.getBirthDay())
                 .withAddress(user.getAddress())
                 .build();
        System.out.println(dto);
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
