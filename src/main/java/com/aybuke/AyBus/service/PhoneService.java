package com.aybuke.AyBus.service;

import com.aybuke.AyBus.repository.IPhoneRepository;
import com.aybuke.AyBus.repository.entity.Phone;
import com.aybuke.AyBus.utility.ServiceManager;

public class PhoneService extends ServiceManager<Phone,Long> {
    private final IPhoneRepository repository;

    public PhoneService(IPhoneRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
