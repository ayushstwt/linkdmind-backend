package com.ayshriv.linkmindbackend.repository;

import com.ayshriv.linkmindbackend.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
