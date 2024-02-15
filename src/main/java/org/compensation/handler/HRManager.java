package org.compensation.handler;

import org.compensation.model.SalaryAdjustmentRequest;

import java.util.Scanner;

public class HRManager implements CompensationHandler {
    private CompensationHandler nextHandler;

    @Override
    public void setNextHandler(CompensationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(SalaryAdjustmentRequest request) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Do you want to approve Salary Adjustment for " + request.getEmployeeName() + " ?"
        );

        String input = scanner.nextLine();

        if ("Y".equalsIgnoreCase(input)) {
            System.out.println(
                "HRManager: I approve this request for " + request.getEmployeeName()
            );

            // this is a final stop...
        } else {
            // HRManager decided not to approve the salary adjustment, so we'll just print a message
            System.out.println("HRManager: Sorry, we don't have a budget...");
        }
    }
}
