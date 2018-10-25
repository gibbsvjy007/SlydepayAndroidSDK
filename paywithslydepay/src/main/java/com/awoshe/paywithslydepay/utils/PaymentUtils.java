package com.awoshe.paywithslydepay.utils;
import java.security.SecureRandom;

public class PaymentUtils {
    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static SecureRandom rnd = new SecureRandom();

    public static String generateOrderCode(){
        StringBuilder sb = new StringBuilder(16);
        for( int i = 0; i < 16; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }
}