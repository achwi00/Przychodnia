package com.project.repository;

import com.project.clinic.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>
{
    boolean existsByEmailAndPassword(String email, String password);

    boolean existsBySessionKey(String sessionKey);
}
