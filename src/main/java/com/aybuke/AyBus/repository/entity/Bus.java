package com.aybuke.AyBus.repository.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.List;

@Table
@Entity
@Data
@Builder
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int seatNum;
    List<Seat> seatList;
    String numberPlate;

    public Bus(int seatNum,List<Seat> seatList,String numberPlate){
        this.seatNum = seatNum;
        this.seatList = seatList;
        this.numberPlate = numberPlate;
    }

    public void bookSeat(Passenger p , int seatId){


    }
}

