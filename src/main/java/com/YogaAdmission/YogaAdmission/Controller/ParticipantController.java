package com.YogaAdmission.YogaAdmission.Controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.YogaAdmission.YogaAdmission.Entity.Participant;
import com.YogaAdmission.YogaAdmission.Repository.ParticipantRepository;

//ParticipantController.java
@RestController
@RequestMapping("/api/participants")
public class ParticipantController {

 @Autowired
 private ParticipantRepository participantRepository;

 @GetMapping
 public ResponseEntity<List<Participant>> getAllParticipants() {
     List<Participant> participants = participantRepository.findAll();
     return ResponseEntity.ok(participants);
 }

 @PostMapping("/enroll")
 public ResponseEntity<String> enrollParticipant(@RequestBody Participant participant) {
     // Basic validation
     if (participant.getAge() < 18 || participant.getAge() > 65) {
         return ResponseEntity.badRequest().body("Invalid age. Must be between 18 and 65.");
     }

     // Save participant details to the database
     participant.setCreatedAt(LocalDateTime.now());
     participantRepository.save(participant);

     // Assume payment process here (CompletePayment() function)

     // Return success response
     return ResponseEntity.ok("Enrollment successful!");
 }
}

