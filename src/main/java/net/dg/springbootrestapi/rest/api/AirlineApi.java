package net.dg.springbootrestapi.rest.api;

import net.dg.springbootrestapi.model.AirlineResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "airline-service", url = "https://api.instantwebtools.net/v1/airlines")
public interface AirlineApi {

    @GetMapping("/{id}")
    AirlineResponse getAirline(@PathVariable Integer id);

    @GetMapping("")
    AirlineResponse createAirline(AirlineResponse response);


}
