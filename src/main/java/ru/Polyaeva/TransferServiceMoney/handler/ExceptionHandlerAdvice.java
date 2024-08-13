package ru.Polyaeva.TransferServiceMoney.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.Polyaeva.TransferServiceMoney.models.ErrorObject;

import java.util.Objects;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorObject> handleArgumentNotValidException(MethodArgumentNotValidException e) {
        return ResponseEntity.badRequest().body(new ErrorObject(0, Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage()));
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorObject> handleRuntimeException(RuntimeException e) {
        return ResponseEntity.internalServerError().body(new ErrorObject(0, e.getMessage()));
    }
}