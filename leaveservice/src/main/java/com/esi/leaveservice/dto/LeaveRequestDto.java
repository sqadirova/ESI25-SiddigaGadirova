package com.esi.leaveservice.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeaveRequestDto {
    private String leaveRequestId;
    private String studentId;
    private String leaveTybe;
    private String leaveDescription;
    @Enumerated(EnumType.STRING)
    private LeaveRequestStatus leaveRequestStatus;
}
