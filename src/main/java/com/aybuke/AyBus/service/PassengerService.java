package com.aybuke.AyBus.service;

import com.aybuke.AyBus.repository.IPassengerRepository;
import com.aybuke.AyBus.repository.entity.Passenger;
import com.aybuke.AyBus.utility.ServiceManager;

public class PassengerService extends ServiceManager<Passenger, Long> {
    private final IPassengerRepository repository;

    public PassengerService(IPassengerRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
