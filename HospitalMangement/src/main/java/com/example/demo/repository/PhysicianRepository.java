package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Physician;

public interface PhysicianRepository extends JpaRepository<Physician,Integer>{

}
