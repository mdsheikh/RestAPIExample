package com.mdsheikh.SpringBootFirstRESTApp.Repository;

import com.mdsheikh.SpringBootFirstRESTApp.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact,Long> {

}
