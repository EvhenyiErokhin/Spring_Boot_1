package com.example.demo.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UuidController {
    private final UuidService uuidService;

    @Autowired
    public UuidController(UuidService uuidService) {
        this.uuidService = uuidService;
    }
    @GetMapping("/uuid")
    public List<UUID> getUuidsList(@RequestParam("size") int size){
        return uuidService.getUuid(size);
    }
}
