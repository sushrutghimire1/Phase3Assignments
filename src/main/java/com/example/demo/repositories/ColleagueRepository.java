package com.example.demo.repositories;

import com.example.demo.models.Colleague;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColleagueRepository extends JpaRepository<Colleague, Integer> {
}
