package creational.builder.dto.impl;

import creational.builder.dto.UserDto;

//product
public class UserWebDto implements UserDto {
    private String name;
    private String address;
    private String age;

    UserWebDto(String name,String address,String age){
        this.name=name;
        this.address=address;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserWebDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
