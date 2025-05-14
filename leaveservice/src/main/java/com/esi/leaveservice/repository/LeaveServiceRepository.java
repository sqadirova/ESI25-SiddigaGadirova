package com.esi.leaveservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.esi.leaveservice.model.LeaveRequest;

public interface LeaveServiceRepository extends JpaRepository<LeaveRequest, String> {
}
