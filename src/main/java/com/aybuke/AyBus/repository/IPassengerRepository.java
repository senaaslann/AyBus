package com.aybuke.AyBus.repository;

import com.aybuke.AyBus.repository.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPassengerRepository extends JpaRepository<Passenger,Long> {
}
