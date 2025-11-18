package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C2823q3;
import g7.C3445p;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.k5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2783k5 {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f35433b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f35434a;

    private C2783k5(Map<String, String> map) {
        HashMap map2 = new HashMap();
        this.f35434a = map2;
        map2.putAll(map);
    }

    private static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static C2783k5 c(SharedPreferences sharedPreferences) {
        HashMap map = new HashMap();
        String strF = f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(strF) && strF.length() > 754) {
            map.put("GoogleConsent", String.valueOf(strF.charAt(754)));
        }
        int iA = a(sharedPreferences, "IABTCF_gdprApplies");
        if (iA != -1) {
            map.put("gdprApplies", String.valueOf(iA));
        }
        int iA2 = a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (iA2 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(iA2));
        }
        int iA3 = a(sharedPreferences, "IABTCF_PolicyVersion");
        if (iA3 != -1) {
            map.put("PolicyVersion", String.valueOf(iA3));
        }
        String strF2 = f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(strF2)) {
            map.put("PurposeConsents", strF2);
        }
        int iA4 = a(sharedPreferences, "IABTCF_CmpSdkID");
        if (iA4 != -1) {
            map.put("CmpSdkID", String.valueOf(iA4));
        }
        return new C2783k5(map);
    }

    public static String d(String str, boolean z10) {
        if (!z10 || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i10 = 1;
        while (true) {
            if (i10 >= 64) {
                i10 = 0;
                break;
            }
            if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10)) {
                break;
            }
            i10++;
        }
        charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i10);
        return String.valueOf(charArray);
    }

    private static String f(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    private final int h() {
        try {
            String str = this.f35434a.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final int i() {
        try {
            String str = this.f35434a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle b() {
        if (!"1".equals(this.f35434a.get("GoogleConsent")) || !"1".equals(this.f35434a.get("gdprApplies")) || !"1".equals(this.f35434a.get("EnableAdvertiserConsentMode"))) {
            return Bundle.EMPTY;
        }
        int i10 = i();
        if (i10 < 0) {
            return Bundle.EMPTY;
        }
        String str = this.f35434a.get("PurposeConsents");
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        String str2 = "denied";
        if (str.length() > 0) {
            bundle.putString(C2823q3.a.AD_STORAGE.f35534B, str.charAt(0) == '1' ? "granted" : "denied");
        }
        if (str.length() > 3) {
            bundle.putString(C2823q3.a.AD_PERSONALIZATION.f35534B, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
        }
        if (str.length() > 6 && i10 >= 4) {
            String str3 = C2823q3.a.AD_USER_DATA.f35534B;
            if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                str2 = "granted";
            }
            bundle.putString(str3, str2);
        }
        return bundle;
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int iH = h();
        if (iH < 0 || iH > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((iH >> 6) & 63));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iH & 63));
        }
        int i10 = i();
        if (i10 < 0 || i10 > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10));
        }
        C3445p.a(true);
        int i11 = "1".equals(this.f35434a.get("gdprApplies")) ? 2 : 0;
        int i12 = i11 | 4;
        if ("1".equals(this.f35434a.get("EnableAdvertiserConsentMode"))) {
            i12 = i11 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12));
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2783k5) {
            return g().equalsIgnoreCase(((C2783k5) obj).g());
        }
        return false;
    }

    final String g() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : f35433b) {
            if (this.f35434a.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append(this.f35434a.get(str));
            }
        }
        return sb2.toString();
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return g();
    }
}
