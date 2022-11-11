package com.aybuke.AyBus.service;


import com.aybuke.AyBus.repository.IBusRepository;
import com.aybuke.AyBus.repository.entity.Bus;
import com.aybuke.AyBus.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BusService  extends ServiceManager<Bus,Long> {

    private final IBusRepository repository; // IBusRepository den methot veya herhangi bir degeri cekebilmek icin bu class a repository adinda bir nesne olusturduk.

    public BusService(IBusRepository rep) { // IBusRepo daki repository nesnesine rep diye bir deger atiyorum bu consta
        super(rep); // ServisManager in constr al dedik
        this.repository = rep; // suanda bulundugu classtaki repo ya ata
    }
}



