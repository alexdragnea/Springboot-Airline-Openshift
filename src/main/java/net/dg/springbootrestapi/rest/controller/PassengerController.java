package net.dg.springbootrestapi.rest.controller;

import lombok.AllArgsConstructor;
import net.dg.springbootrestapi.model.AirlineResponse;
import net.dg.springbootrestapi.model.PassengerResponse;
import net.dg.springbootrestapi.service.AirlineService;
import net.dg.springbootrestapi.service.PassengerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/passenger")
public class PassengerController {


    private final PassengerService passengerService;

    @GetMapping("/{id}")
    public ResponseEntity<PassengerResponse> getPassengerById(@PathVariable String id){
        return ResponseEntity.ok(passengerService.getPassengerById(id));
    }
}
