package ru.Polyaeva.TransferServiceMoney.service;

import ru.Polyaeva.TransferServiceMoney.models.ConfirmOperation;
import ru.Polyaeva.TransferServiceMoney.models.Operation;

public interface MoneyTransferService {
    String proceedOperation(Operation operation);

    String confirmOperation(ConfirmOperation operation);
}