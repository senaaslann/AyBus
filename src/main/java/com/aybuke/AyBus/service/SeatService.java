package com.aybuke.AyBus.service;


import com.aybuke.AyBus.repository.ISeatRepository;
import com.aybuke.AyBus.repository.entity.Seat;
import com.aybuke.AyBus.utility.ServiceManager;

public class SeatService extends ServiceManager<Seat,Long> {
    private final ISeatRepository repository;

    public SeatService(ISeatRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
