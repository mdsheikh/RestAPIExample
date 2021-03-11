package com.mdsheikh.SpringBootFirstRESTApp.Model;

import javax.persistence.*;

@Entity
@Table(name = "contact_info")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "PhoneNumber")
    private String phone;

    public Contact() {

    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
