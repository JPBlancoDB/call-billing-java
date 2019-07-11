package com.telecom.billing;

import com.telecom.domain.Tariff;
import com.telecom.domain.TariffTypes;

import java.util.HashMap;
import java.util.function.Function;

class TariffService {

    private static final HashMap<TariffTypes, Function<Integer, Double>> CALCULATIONS = new HashMap<>() {
        {
            put(TariffTypes.REGULAR, minutes -> CalculateRegularTariff(minutes));
            put(TariffTypes.LATE_NIGHT, minutes -> CalculateLateNightTariff(minutes));
            put(TariffTypes.WEEKEND, minutes -> CalculateWeekendTariff(minutes));
        }
    };

    static double calculate(TariffTypes tariffType, int minutes) {
        return CALCULATIONS
                .get(tariffType)
                .apply(minutes);
    }

    private static double CalculateRegularTariff(int minutes) {
        return minutes * Tariff.REGULAR_TARIFF;
    }

    private static double CalculateLateNightTariff(int minutes) {
        return minutes * Tariff.LATE_NIGHT;
    }

    private static double CalculateWeekendTariff(int minutes) {
        return minutes * Tariff.WEEKEND;
    }

}
