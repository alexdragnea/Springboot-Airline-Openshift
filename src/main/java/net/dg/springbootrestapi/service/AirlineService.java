package net.dg.springbootrestapi.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.dg.springbootrestapi.model.AirlineResponse;
import net.dg.springbootrestapi.rest.api.AirlineApi;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class AirlineService {

    private final AirlineApi airlineApi;

    public AirlineResponse getAirlineById(Integer id){
        log.info("Inside getAirlineById of AirlineService.");
        return airlineApi.getAirline(id);
    }
}
