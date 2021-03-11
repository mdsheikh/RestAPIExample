package com.mdsheikh.SpringBootFirstRESTApp.Controller;

import com.mdsheikh.SpringBootFirstRESTApp.Model.Contact;
import com.mdsheikh.SpringBootFirstRESTApp.Repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactRepo contactRepo;

    @GetMapping("/contact")
    public List<Contact> getAllContact(){
       return contactRepo.findAll();

    }

    @PostMapping("/contact")
    public Contact addContact(@RequestBody Contact contact){
        return contactRepo.save(contact);
    }

    //@DeleteMapping("/contact")
    //public Contact delete(@RequestBody Contact contact){
       // return contactRepo.delete();
    //}


}
