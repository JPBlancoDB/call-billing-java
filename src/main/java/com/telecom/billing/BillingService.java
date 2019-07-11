package com.telecom.billing;

import com.telecom.domain.Call;

import java.util.List;


public class BillingService {

    public double CalculateBill(List<Call> callHistory) {
        double totalAmount = 0d;

        for (Call call : callHistory) {
            totalAmount += TariffService.calculate(call.getTariffType(), call.getMinutes());
        }

        return totalAmount;
    }

}
