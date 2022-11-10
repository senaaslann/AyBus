package com.aybuke.AyBus.controller;


import com.aybuke.AyBus.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Seat")
public class SeatController {
    private final SeatService service;
}
