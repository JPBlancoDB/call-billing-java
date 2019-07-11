package com.telecom.billing;

import com.telecom.domain.Call;
import com.telecom.domain.CallTypes;

import java.util.List;


public class BillingService {

    public double CalculateBill(List<Call> callHistory) {
        double totalAmount = 0d;

        for (Call call : callHistory) {
            double amount = TariffService.calculate(call.getTariffType(), call.getMinutes());
            totalAmount += CallTypeService.calculate(call.getCallType(), amount);
        }

        return totalAmount;
    }



}
