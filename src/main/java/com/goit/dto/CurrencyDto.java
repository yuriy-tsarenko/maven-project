package com.goit.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CurrencyDto {
    private String currency;
    private Double value;
}
