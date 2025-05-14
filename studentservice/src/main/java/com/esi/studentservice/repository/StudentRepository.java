package com.esi.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esi.studentservice.model.LeaveRequest;

public interface StudentRepository extends JpaRepository<LeaveRequest, String> {
}
