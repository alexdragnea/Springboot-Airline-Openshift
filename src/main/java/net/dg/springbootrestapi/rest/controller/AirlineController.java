package net.dg.springbootrestapi.rest.controller;

import lombok.AllArgsConstructor;
import net.dg.springbootrestapi.model.AirlineResponse;
import net.dg.springbootrestapi.service.AirlineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/airline")
public class AirlineController {

    private final AirlineService airlineService;

    @GetMapping("/{id}")
    public ResponseEntity<AirlineResponse> getAirlineById(@PathVariable Integer id){
        return ResponseEntity.ok(airlineService.getAirlineById(id));
    }

}
