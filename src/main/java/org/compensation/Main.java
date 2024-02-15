package org.compensation;

import org.compensation.handler.CompensationHandler;
import org.compensation.handler.HRManager;
import org.compensation.handler.LineManagerHandler;
import org.compensation.handler.TeamLeadHandler;
import org.compensation.model.SalaryAdjustmentRequest;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        CompensationHandler teamLead = new TeamLeadHandler();
        CompensationHandler lineManager = new LineManagerHandler();
        CompensationHandler hrManager = new HRManager();

        // set the chain of responsibility
        teamLead.setNextHandler(lineManager);
        lineManager.setNextHandler(hrManager);

        // sample salary adjustment request
        SalaryAdjustmentRequest request = new SalaryAdjustmentRequest(
            "John Doe",
            3200,
            300
        );

        // Start the process at the first handler (team lead)
        teamLead.handleRequest(request);

    }
}