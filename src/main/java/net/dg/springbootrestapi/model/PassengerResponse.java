package net.dg.springbootrestapi.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class PassengerResponse {

    private String _id;
    private String name;
}
