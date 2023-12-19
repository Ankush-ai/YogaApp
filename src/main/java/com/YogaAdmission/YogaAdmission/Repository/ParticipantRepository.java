package com.YogaAdmission.YogaAdmission.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.YogaAdmission.YogaAdmission.Entity.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}