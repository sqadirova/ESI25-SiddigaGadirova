package com.esi.leaveservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esi.leaveservice.dto.LeaveRequestDto;
import com.esi.leaveservice.model.LeaveRequest;
import com.esi.leaveservice.repository.LeaveServiceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class LeaveServiceService {

  @Autowired
  private LeaveServiceRepository leaveServiceRepository;

  public void updateLeaveResponse(LeaveRequestDto leaveRequestDto) {

    LeaveRequest leaveRequest = LeaveRequest.builder()
        .leaveRequestId(leaveRequestDto.getLeaveRequestId())
        .studentId(leaveRequestDto.getStudentId())
        .leaveTybe(leaveRequestDto.getLeaveTybe())
        .leaveDescription(leaveRequestDto.getLeaveDescription())
        .leaveRequestStatus(leaveRequestDto.getLeaveRequestStatus())
        .build();

    log.info("A leave reuest with user id: {} has been updated", leaveRequest.getLeaveRequestId());

    leaveServiceRepository.save(leaveRequest);
  }

}
