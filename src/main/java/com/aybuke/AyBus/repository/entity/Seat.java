package com.aybuke.AyBus.repository.entity;


import lombok.Builder;
import lombok.Data;
import javax.persistence.*;

@Table
@Entity
@Data
@Builder
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Boolean status;
    Passenger passenger;

    public  Seat( boolean status, Passenger passenger){
        this.status = status;
        this.passenger = passenger;
    }

    public void display(){
        if (status){
            System.out.println("Koltuk Doludur");

        }else {
            System.out.println("Koltuk id:" + id);
        }


    }
}
