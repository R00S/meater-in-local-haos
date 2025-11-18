package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.p0 */
/* loaded from: classes2.dex */
final class C7564p0 {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f27869a;

    C7564p0(Map<String, Map<String, String>> map) {
        this.f27869a = map;
    }

    /* renamed from: a */
    static C7564p0 m21273a() {
        return new C7564p0(null);
    }

    /* renamed from: b */
    final String m21274b(Uri uri, String str, String str2, String str3) {
        if (this.f27869a == null) {
            return null;
        }
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map<String, String> map = this.f27869a.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String strValueOf = String.valueOf(str3);
            str3 = strValueOf.length() != 0 ? str2.concat(strValueOf) : new String(str2);
        }
        return map.get(str3);
    }
}
