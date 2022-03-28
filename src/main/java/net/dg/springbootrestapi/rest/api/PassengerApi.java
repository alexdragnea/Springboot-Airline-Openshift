package net.dg.springbootrestapi.rest.api;


import net.dg.springbootrestapi.model.AirlineResponse;
import net.dg.springbootrestapi.model.PassengerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "passenger-service", url = "https://api.instantwebtools.net/v1/passenger")
public interface PassengerApi {

    @GetMapping("/{id}")
    PassengerResponse getPassenger(@PathVariable String id);
}
