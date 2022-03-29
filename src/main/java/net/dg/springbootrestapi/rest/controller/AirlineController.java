package net.dg.springbootrestapi.rest.controller;

import lombok.AllArgsConstructor;
import net.dg.springbootrestapi.model.AirlineResponse;
import net.dg.springbootrestapi.service.AirlineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/airline")
public class AirlineController {

    private final AirlineService airlineService;

    @GetMapping("/{id}")
    public ResponseEntity<AirlineResponse> getAirlineById(@PathVariable Integer id){
        return ResponseEntity.ok(airlineService.getAirlineById(id));
    }

    @PostMapping("")
    public ResponseEntity<AirlineResponse> createAirline(@RequestBody AirlineResponse response){
        return ResponseEntity.ok(airlineService.createAirline(response));
    }

}
