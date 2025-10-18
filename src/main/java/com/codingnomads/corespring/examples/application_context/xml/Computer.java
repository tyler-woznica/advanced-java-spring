package com.codingnomads.corespring.examples.application_context.xml;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Computer {
    private String brand;
    private String model;
}
