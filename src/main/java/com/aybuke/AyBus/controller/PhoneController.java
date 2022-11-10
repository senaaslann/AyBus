package com.aybuke.AyBus.controller;

import com.aybuke.AyBus.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
@RequiredArgsConstructor

public class PhoneController {
    private final PhoneService service;
}
