package com.aybuke.AyBus.repository;

import com.aybuke.AyBus.repository.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBusRepository extends JpaRepository<Bus,Long> {
}
