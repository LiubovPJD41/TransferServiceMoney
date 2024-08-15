package ru.Polyaeva.TransferServiceMoney.service;

import org.springframework.stereotype.Service;
import ru.Polyaeva.TransferServiceMoney.models.ConfirmOperation;
import ru.Polyaeva.TransferServiceMoney.models.Operation;
import ru.Polyaeva.TransferServiceMoney.repository.OperationRepository;

@Service
public class MoneyTransferServicelmpl implements MoneyTransferService {
    private OperationRepository operationRepository;

    public void MoneyTransferServiceImpl(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }

    public MoneyTransferServicelmpl(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }

    @Override
    public String proceedOperation(Operation operation) {
        return operationRepository.addOperationToList(operation);
    }

    @Override
    public String confirmOperation(ConfirmOperation operation) {
        return operationRepository.updateOperation(operation);
    }
}
