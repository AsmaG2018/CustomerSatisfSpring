package com.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.easynotes.model.Session;

public interface SessionRepository extends JpaRepository<Session , Long> {

}
