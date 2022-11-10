package com.aybuke.AyBus.controller;


import com.aybuke.AyBus.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Passenger")
@RequiredArgsConstructor
public class PassengerController {
    private final PassengerService service;
}
