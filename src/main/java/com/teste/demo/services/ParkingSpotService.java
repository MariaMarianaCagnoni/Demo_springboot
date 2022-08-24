package com.teste.demo.services;


import com.teste.demo.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
 public class ParkingSpotService {



    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
