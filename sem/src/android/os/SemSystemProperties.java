package android.os;

import android.os.SystemProperties;

public class SemSystemProperties {
  public static String get(String paramString) {
    return SystemProperties.get(paramString);
  }
  
  public static String get(String paramString1, String paramString2) {
    return SystemProperties.get(paramString1, paramString2);
  }
  
  public static boolean getBoolean(String paramString, boolean paramBoolean) {
    return SystemProperties.getBoolean(paramString, paramBoolean);
  }
  
  public static String getCountryCode() {
    return SystemProperties.get("ro.csc.country_code", "");
  }
  
  public static String getCountryIso() {
    return SystemProperties.get("ro.csc.countryiso_code", "");
  }
  
  @Deprecated
  public static String getDeviceSerialNumber() {
    return SystemProperties.get("ril.serialnumber", "00000000000");
  }
  
  public static int getInt(String paramString, int paramInt) {
    return SystemProperties.getInt(paramString, paramInt);
  }
  
  public static long getLong(String paramString, long paramLong) {
    return SystemProperties.getLong(paramString, paramLong);
  }
  
  public static String getSalesCode() {
    return SystemProperties.get("ro.csc.sales_code", "");
  }
  
  public static void set(String paramString1, String paramString2) {
    SystemProperties.set(paramString1, paramString2);
  }
}
