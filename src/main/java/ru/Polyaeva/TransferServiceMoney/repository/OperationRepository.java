package ru.Polyaeva.TransferServiceMoney.repository;

import ru.Polyaeva.TransferServiceMoney.exceptions.UnknownOperation;
import ru.Polyaeva.TransferServiceMoney.models.ConfirmOperation;
import ru.Polyaeva.TransferServiceMoney.models.Operation;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public interface OperationRepository {
    ConcurrentHashMap<Integer, Operation> getOperationList();

    AtomicLong getOperationId();

    String addOperationToList(Operation operation);

    String updateOperation(ConfirmOperation operation) throws UnknownOperation;
}