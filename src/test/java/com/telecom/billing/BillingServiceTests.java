package com.telecom.billing;

import com.telecom.domain.Call;
import com.telecom.domain.CallTypes;
import com.telecom.domain.Tariff;
import com.telecom.domain.TariffTypes;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BillingServiceTests {

    private BillingService billingService;

    public BillingServiceTests() {
        billingService = new BillingService();
    }

    @Test
    public void regularTariff_ShouldCharge5PencePerMinute() {
        double result = billingService.CalculateBill(CreateCallHistory(TariffTypes.REGULAR, CallTypes.NATIONAL));

        Assert.assertEquals((3 * Tariff.REGULAR_TARIFF), result, 0);
    }

    @Test
    public void lateNightTariff_ShouldCharge2PencePerMinute() {
        double result = billingService.CalculateBill(CreateCallHistory(TariffTypes.LATE_NIGHT, CallTypes.NATIONAL));

        Assert.assertEquals((3 * Tariff.LATE_NIGHT), result, 0);
    }

    @Test
    public void weekendTariff_ShouldCharge1PencePerMinute() {
        double result = billingService.CalculateBill(CreateCallHistory(TariffTypes.WEEKEND, CallTypes.NATIONAL));

        Assert.assertEquals((3 * Tariff.WEEKEND), result, 0);
    }

    @Test
    public void internationalCall_ShouldChargeDoubleTheRate() {
        double result = billingService.CalculateBill(CreateCallHistory(TariffTypes.REGULAR, CallTypes.INTERNATIONAL));

        Assert.assertEquals((3 * Tariff.REGULAR_TARIFF * 2), result, 0);
    }

    private ArrayList<Call> CreateCallHistory(TariffTypes tariffType, CallTypes callType) {
        return new ArrayList<>() {
            {
                add(new Call(1, tariffType, callType));
                add(new Call(2, tariffType, callType));
            }
        };
    }

}