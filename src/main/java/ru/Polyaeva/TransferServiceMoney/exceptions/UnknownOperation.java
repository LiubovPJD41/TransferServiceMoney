package ru.Polyaeva.TransferServiceMoney.exceptions;

public class UnknownOperation extends RuntimeException {
    public UnknownOperation() {
        super("Unknown operation");
    }
}
