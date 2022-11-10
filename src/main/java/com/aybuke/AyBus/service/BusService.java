package com.aybuke.AyBus.service;


import com.aybuke.AyBus.repository.IBusRepository;
import com.aybuke.AyBus.repository.entity.Bus;
import com.aybuke.AyBus.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BusService  extends ServiceManager<Bus,Long> {

    private final IBusRepository repository;

    public BusService(IBusRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
