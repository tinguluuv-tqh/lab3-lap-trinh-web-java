package com.example.studenmanager.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studenmanager.entity.Student;


public interface StudentRepository extends JpaRepository<Student, UUID> {


    List<Student> findByStudentCodeContainingIgnoreCaseOrFullNameContainingIgnoreCaseOrEmailContainingIgnoreCaseOrPhoneContainingIgnoreCase(
            String studentCode,
            String fullName,
            String email,
            String phone);
}

