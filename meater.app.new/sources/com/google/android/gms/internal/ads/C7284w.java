package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.w */
/* loaded from: classes2.dex */
final class C7284w extends zzadc {
    C7284w() {
    }

    /* renamed from: b */
    private static String m15974b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i2 = 0;
        int length = str.length();
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i2) {
            return null;
        }
        return (i2 == 0 && length == str.length()) ? str : str.substring(i2, length);
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    /* renamed from: a */
    public final String mo15917a(String str, String str2) {
        String strM15974b = m15974b(str);
        String strM15974b2 = m15974b(str2);
        if (TextUtils.isEmpty(strM15974b)) {
            return strM15974b2;
        }
        if (TextUtils.isEmpty(strM15974b2)) {
            return strM15974b;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(strM15974b).length() + 1 + String.valueOf(strM15974b2).length());
        sb.append(strM15974b);
        sb.append(",");
        sb.append(strM15974b2);
        return sb.toString();
    }
}
