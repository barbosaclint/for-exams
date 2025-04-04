package com.kurinto.forexams.person;

public record PersonDTO(Integer id,
                        String firstName,
                        String lastName,
                        String email,
                        String gender,
                        Integer age) {

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}