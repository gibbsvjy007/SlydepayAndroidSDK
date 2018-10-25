package com.awoshe.paywithslydepay.core;
import android.content.Context;
import com.awoshe.paywithslydepay.offline.PrefsManager;

public class SlydepayPayment {

    private Context context;

    public SlydepayPayment(Context context){
        this.context = context;
    }

    /**
     * This method is used to initialize the mobile money sdk with
     * the credentials provided by MTN that verifies you to make
     * sure you have the authorization to use this adk
     * @param merchantEmail This is the merchant email or phone number
     * @param merchantKey  This is the merchant key provided by Slydepay
     * @see String#toLowerCase()
     */
    public void initCredentials(String merchantEmail,String merchantKey){
        new PrefsManager(context).initCredentials(merchantEmail,merchantKey);
    }
}