package com.bookstore.jpaw.repositories;

import com.bookstore.jpaw.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID> {


}
