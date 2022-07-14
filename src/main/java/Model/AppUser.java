package Model;

import Model.Enum.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class AppUser {
    private Long id;

    private String firstName;
    private List<Role> roles = new ArrayList<>();

    private String lastName;

    public AppUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }



    private Account account;
    private City city;

    private Address address;
    private int age;
    private Gender gender;


    public AppUser(String firstName,
                   String lastName,

                   ArrayList<Role> roles,

                   Address address,
                   Account account) {
        this.firstName = firstName;
        this.roles = roles;
        this.lastName = lastName;
        this.address = address;
        this.account = account;
    }

    public AppUser() {

    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}