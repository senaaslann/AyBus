package com.aybuke.AyBus.repository.entity;

import com.aybuke.AyBus.repository.enums.EPhoneType;
import lombok.Builder;

import javax.persistence.*;

@Table(name="tblphone")
@Entity
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

    public Phone (String countryCode,String code ,String phoneNumber,EPhoneType type ){
        this.countryCode = countryCode;
        this.code = code;
        this.phoneNumber = phoneNumber;
        this.type = type;

    }
    public Phone (String code ,String phoneNumber,EPhoneType type ){
        this.countryCode = "+90"; // disaridan aldigin deger olmayacak otomatik olarak tanimlanacak
        this.code = code;
        this.phoneNumber = phoneNumber;
        this.type = type;

    }

    public void display (){
        System.out.println( "Kullanici Telefon " +type +":" + countryCode + code + phoneNumber );

    }








 // getter setter olusturduk get demek db den cagirmak demek set demek yeni bir atama yapmak demek o yuzden id nin setini kullanmayacagiz cunku id final bir deger olarak kalacak.
    public Long getId() {
        return id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public EPhoneType getType() {
        return type;
    }

    public void setType(EPhoneType type) {
        this.type = type;
    }
}
