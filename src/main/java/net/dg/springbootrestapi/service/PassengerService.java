package net.dg.springbootrestapi.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.dg.springbootrestapi.model.AirlineResponse;
import net.dg.springbootrestapi.model.PassengerResponse;
import net.dg.springbootrestapi.rest.api.AirlineApi;
import net.dg.springbootrestapi.rest.api.PassengerApi;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class PassengerService {

    private final PassengerApi passengerApi;

    public PassengerResponse getPassengerById(String id){
        log.info("Inside getPassengerById method of PassengerService.");
        return passengerApi.getPassenger(id);
    }
}
