package com.esi.leaveservice.model;

import com.esi.leaveservice.dto.LeaveRequestStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "leaveservicetable")
public class LeaveRequest {
    @Id
    private String leaveRequestId;
    private String studentId;
    private String leaveTybe;
    private String leaveDescription;
    @Enumerated(EnumType.STRING)
    private LeaveRequestStatus leaveRequestStatus;

}
