package com.aybuke.AyBus.controller;

import com.aybuke.AyBus.service.BusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bus")
public class BusController {
    private final BusService service;

}
