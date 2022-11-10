package com.aybuke.AyBus.repository.entity;

import com.aybuke.AyBus.repository.enums.EPhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String countryCode;
    String code;
    String phoneNumber;
    @Enumerated(EnumType.STRING)
    EPhoneType type;



}
