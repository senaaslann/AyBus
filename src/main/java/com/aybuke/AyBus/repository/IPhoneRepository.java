package com.aybuke.AyBus.repository;

import com.aybuke.AyBus.repository.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhoneRepository extends JpaRepository<Phone,Long> {
}
