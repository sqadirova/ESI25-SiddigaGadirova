package com.esi.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.esi.studentservice.dto.LeaveRequestDto;
import com.esi.studentservice.service.StudentService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/leaverequests")
    public ResponseEntity<String> addLeaveRequest(@RequestBody LeaveRequestDto leaveRequestDto) {
        studentService.addLeaveRequest(leaveRequestDto);
        return ResponseEntity.ok("A leave request has been created");

    }

//    Task 1
    @GetMapping("/leaverequests")
    public List<LeaveRequestDto> getAllLeaveRequests() {
        return studentService.getAllleaveRequests();
    }

}
