package com.esi.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esi.studentservice.dto.LeaveRequestDto;
import com.esi.studentservice.service.StudentService;

import lombok.RequiredArgsConstructor;

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
}
