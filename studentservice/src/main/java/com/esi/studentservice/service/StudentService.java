package com.esi.studentservice.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esi.studentservice.dto.LeaveRequestDto;
import com.esi.studentservice.model.LeaveRequest;
import com.esi.studentservice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<LeaveRequestDto> getAllleaveRequests() {
        List<LeaveRequest> leaveRequests = new ArrayList<>();
        studentRepository.findAll().forEach(leaveRequests::add);
        return leaveRequests.stream().map(this::mapToleaveRequestDto).toList();
    }

    private LeaveRequestDto mapToleaveRequestDto(LeaveRequest leaveRequest) {
        return LeaveRequestDto.builder()
                .leaveRequestId(leaveRequest.getLeaveRequestId())
                .studentId(leaveRequest.getStudentId())
                .leaveTybe(leaveRequest.getLeaveTybe())
                .leaveDescription(leaveRequest.getLeaveDescription())
                .justification(leaveRequest.getJustification())
                .leaveRequestStatus(leaveRequest.getLeaveRequestStatus())
                .build();
    }

    public void addLeaveRequest(LeaveRequestDto leaveRequestDto) {
    }

}
