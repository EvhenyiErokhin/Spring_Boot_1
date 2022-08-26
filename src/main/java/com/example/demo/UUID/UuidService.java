package com.example.demo.UUID;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UuidService {
    public List<UUID> getUuid(int size){
        List<UUID> uuidList = new ArrayList<>();
        for (int i = 0; i < size; i++){
            uuidList.add(UUID.randomUUID());
        }
        return uuidList;
    }
}
