package com.abrardev.usermanagementsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrardev.usermanagementsystem.entity.OurUsers;

public interface UserRepo extends JpaRepository<OurUsers, Integer> {

	Optional<OurUsers> findByEmail(String email);

}
