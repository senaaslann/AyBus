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

    public void bookSeat(Passenger p , int seatId){ // disaridan alacagimiz degerler passenger bilgileri ve oturmak istedigi koltuk numarasi
      Seat seat =(Seat) seatList.stream().filter(s -> s.getId() ==seatId ); // seat nesnesi olusturduk ve listin icerisinde donduk
      if(seat.getStatus()){
          System.out.println(seatId + "Koltuk doludur"); // status true gelirse if calisti
          System.out.println(seat.getPassenger().toString()); // ve o koltuktaki kullaniciyi yazdirdik tostring ile stringe cevirdik
        }else { // status false gelirse
          ((Seat) seatList.stream().filter(s -> s.getId() == seatId )).setPassenger(p);//verilen koltuk nosunu get id ile eslestirdik   girilen degerleri kullaniciya atadik
          ((Seat) seatList.stream().filter(s -> s.getId() == seatId )).setStatus(true); // statusu true ya cevirdik
          System.out.println(seatId + "Nolu koltuk rezerve edilmistir.");
      }


    }
    public void printAllPassengers(){

        seatList.stream().filter(s -> s.getStatus() == true ).forEach( p -> System.out.println(p.getPassenger()) ); // seat listeyi dondurdum ve filtreledim true olanlari foreach ile yazdirdim

    }

    public void printAllAvailableSeatId(){
        seatList.stream().filter(seat -> seat.getStatus()== false).forEach(seat -> System.out.println(seat.getId()));// seat listeyi dondurdum filtreledim bos olanlari yazdirdim
    }

    public void Search(String name, String surname){
        seatList.stream().filter(P -> P.getPassenger().getName().equalsIgnoreCase(name) && // kullanicidan isim al buyuk kucuk esitle ve soyisimal buyuk kucuk esitle dedim esitse
                P.getPassenger().getSurname().equalsIgnoreCase(surname)).forEach(t -> t.getPassenger().getPhone().display() ); // for un icerisine kullanici sinifina git
        // oradan phone sinifina git ve oradaki methotu yazdir dedim

    }
}

