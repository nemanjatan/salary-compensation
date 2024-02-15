package org.compensation.model;

public class SalaryAdjustmentRequest {
    private String employeeName; // example: John doe
    private int currentSalary; // example: 3200 (dollars)
    private int requestRaise; // example: 300 (dollars)

    public SalaryAdjustmentRequest(String employeeName, int currentSalary, int requestRaise) {
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
        this.requestRaise = requestRaise;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(int currentSalary) {
        this.currentSalary = currentSalary;
    }

    public int getRequestRaise() {
        return requestRaise;
    }

    public void setRequestRaise(int requestRaise) {
        this.requestRaise = requestRaise;
    }
}
