package com.aybuke.AyBus.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.List;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int seatNum;
    List<Seat> seatList;
    String numberPlate;


}
