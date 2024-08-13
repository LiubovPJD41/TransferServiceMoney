package ru.Polyaeva.TransferServiceMoney.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record Amount(
        @Min(1)
        Integer value,
        @NotBlank
        String currency
) {
}