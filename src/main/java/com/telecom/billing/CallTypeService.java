package com.telecom.billing;

import com.telecom.domain.CallTypes;

class CallTypeService {
    static double calculate(CallTypes callType, double amount) {
        return callType == CallTypes.INTERNATIONAL
                ? amount * 2
                : amount;
    }
}
