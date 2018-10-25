package com.awoshe.slydepayandroidsdk;

import android.app.Application;
import com.awoshe.paywithslydepay.core.SlydepayPayment;

public class ApplicationSingleton extends Application {
    String MERCHANT_KEY = "1522241372731";
    String MERCHANT_EMAIL = "info@awoshe.com";
    @Override
    public void onCreate() {
        super.onCreate();
        new SlydepayPayment(this).initCredentials(MERCHANT_EMAIL, MERCHANT_KEY);
    }
}
