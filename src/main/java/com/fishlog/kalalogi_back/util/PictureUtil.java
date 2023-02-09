package com.fishlog.kalalogi_back.util;

public class PictureUtil {

    public static String byteArrayToString(byte[] byteArray){
        if (byteArray == null) {
            return null;
        }
        return new String(byteArray);
    }
}
