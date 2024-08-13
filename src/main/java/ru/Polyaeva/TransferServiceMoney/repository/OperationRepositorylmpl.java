package ru.Polyaeva.TransferServiceMoney.repository;

import org.springframework.stereotype.Repository;
import ru.Polyaeva.TransferServiceMoney.exceptions.UnknownOperation;
import ru.Polyaeva.TransferServiceMoney.models.ConfirmOperation;
import ru.Polyaeva.TransferServiceMoney.models.Operation;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class OperationRepositoryImpl implements OperationRepository {
    private final ConcurrentHashMap<Integer, Operation> operationList = new ConcurrentHashMap<>();
    private final AtomicLong operationId = new AtomicLong(1L);

    @Override
    public ConcurrentHashMap<Integer, Operation> getOperationList() {
        return operationList;
    }

    @Override
    public AtomicLong getOperationId() {
        return operationId;
    }

    @Override
    public String addOperationToList(Operation operation) {
        operationList.put(operationId.intValue(), operation);
        System.out.println(operationId);
        return String.valueOf(operationId.addAndGet(1) - 1);
    }

    @Override
    public String updateOperation(ConfirmOperation operation) throws UnknownOperation {
        if (operationList.get(Integer.parseInt(operation.operationId())) == null) {
            throw new UnknownOperation();
        }

        return operation.operationId();
    }
}
