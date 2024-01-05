package creational.builder2;

import creational.builder2.builder.impl.PersonBuilder;
import creational.builder2.entity.Person;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        Person person= PersonBuilder.builder()
                .withFirstName("Phoenix")
                .withLastName("phoenix")
                .withBirthDate(LocalDate.of(1997,12,01))
                .build();

        System.out.println(person);
    }
}
