package com.nivedita.app.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nivedita.app.crud.models.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
