package org.compensation.handler;

import org.compensation.model.SalaryAdjustmentRequest;

public interface CompensationHandler {
    void setNextHandler(CompensationHandler nextHandler);
    void handleRequest(SalaryAdjustmentRequest request);
}
