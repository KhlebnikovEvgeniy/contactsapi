package com.khlebnikovevgeniy.contactsapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khlebnikovevgeniy.contactsapi.domain.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, String> {
	Optional<Contact> findById(String id);
}
