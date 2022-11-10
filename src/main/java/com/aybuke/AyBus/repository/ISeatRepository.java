package com.aybuke.AyBus.repository;

import com.aybuke.AyBus.repository.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISeatRepository extends JpaRepository<Seat,Long> {
}
