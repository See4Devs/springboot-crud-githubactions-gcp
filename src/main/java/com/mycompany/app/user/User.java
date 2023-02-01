package com.mycompany.app.user;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    //Constructor
    public User(Integer id, String name, Integer age, String email) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}