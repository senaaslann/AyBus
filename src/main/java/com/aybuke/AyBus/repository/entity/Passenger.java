package com.aybuke.AyBus.repository.entity;

import com.aybuke.AyBus.repository.enums.EGender;

import lombok.Builder;
import lombok.Data;


import javax.persistence.*;

@Table
@Entity
@Data
@Builder
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    Phone phone;
    @Enumerated(EnumType.STRING)
    EGender gender;

    public Passenger(String name ,String surname ,Phone phone ,EGender gender){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.gender = gender;
    }

    public void display(){
        System.out.println( "Isim Soyisim:" + name + " " + surname);
        phone.display();
        System.out.println( "Cinsiyet:" + gender);
    }

}
