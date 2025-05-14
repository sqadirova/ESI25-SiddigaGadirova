package com.esi.leaveservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esi.leaveservice.dto.LeaveRequestDto;
import com.esi.leaveservice.service.LeaveServiceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class LeaveServiceController {

    @Autowired
    private LeaveServiceService leaveServiceService;

    @PutMapping("/leaveserviceresponse")
    public ResponseEntity<String> updateLeaveResponse(@RequestBody LeaveRequestDto leaveRequestDto) {
        leaveServiceService.updateLeaveResponse(leaveRequestDto);
        return ResponseEntity.ok("A leave request is updated");

    }
}
