package ru.Polyaeva.TransferServiceMoney.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record Operation(
        @NotBlank
        @Digits(integer = 16, fraction = 0)
        String cardFromNumber,
        @NotBlank
        @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$")
        String cardFromValidTill,
        @NotBlank
        @Digits(integer = 3, fraction = 0)
        String cardFromCVV,
        @NotBlank
        @Digits(integer = 16, fraction = 0)
        String cardToNumber,
        @Valid
        Amount amount
) {
    @Override
    public String toString() {
        return "Operation{" +
                ", cardFromNumber='" + cardFromNumber + '\'' +
                ", cardFromValidTill='" + cardFromValidTill + '\'' +
                ", cardFromCVV='" + cardFromCVV + '\'' +
                ", cardToNumber='" + cardToNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}