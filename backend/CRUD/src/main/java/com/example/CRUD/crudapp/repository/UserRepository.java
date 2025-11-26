package com.example.CRUD.crudapp.repository;

import com.example.CRUD.crudapp.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}

