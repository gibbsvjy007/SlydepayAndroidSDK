package com.awoshe.paywithslydepay.utils;
import com.awoshe.paywithslydepay.models.PaymentOption;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JSONUtils {

    public static ArrayList<PaymentOption> getPaymentOptions(JSONObject json) throws JSONException {
        ArrayList<PaymentOption> paymentOptions = new ArrayList<>();
        JSONArray getPaymentOptions = json.getJSONArray("result");

        for (int i=0;i<getPaymentOptions.length();i++){
            PaymentOption paymentOption = new PaymentOption();
            JSONObject c = getPaymentOptions.getJSONObject(i);
            paymentOption.setName(c.getString("name"));
            paymentOption.setShortName(c.getString("shortName"));
            paymentOption.setActive(c.getBoolean("active"));
            paymentOption.setLogoURL(c.getString("logourl"));

            if (paymentOption.isActive() && !paymentOption.getShortName().equalsIgnoreCase("SLYDEPAY"))
                paymentOptions.add(paymentOption);
        }

        return paymentOptions;
    }

}
