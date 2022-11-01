package com.example.register.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.register.model.RegisterPage;

public interface RegisterRepository extends JpaRepository<RegisterPage, String>{

}
