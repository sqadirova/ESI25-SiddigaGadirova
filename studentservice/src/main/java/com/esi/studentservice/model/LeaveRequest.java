package com.esi.studentservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "studenttable")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeaveRequest {
    @Id
    private String leaveRequestId;
    private String studentId;
    private String leaveTybe;
    private String leaveDescription;
    private String justification;
    @Enumerated(EnumType.STRING)
    private LeaveRequestStatus leaveRequestStatus;
}
